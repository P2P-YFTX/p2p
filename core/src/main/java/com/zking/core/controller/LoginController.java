package com.zking.core.controller;

import com.zking.core.model.StateStatus;
import com.zking.core.model.User;
import com.zking.core.service.IStateStatusService;
import com.zking.core.service.IUserService;
import com.zking.core.userUtil.GetRealCode;
import com.zking.core.userUtil.GetSendSMS;
import com.zking.core.userUtil.RandomValidateCode;
import com.zking.core.util.JsonData;
import com.zking.core.util.PasswordHelper;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RequestMapping(value = "user")
@Controller
public class LoginController{
    @Autowired
    IUserService userService;
    @Autowired
    IStateStatusService statusService;


    @RequestMapping(value = "/home/index.html")
    public String toHome(){
        return "redirect:login.do";
    }

    /**
     * 获取生成验证码显示到 UI 界面
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value="/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");

        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object Login(User user,String valicode, HttpServletRequest request) {
        JsonData jsonData = new JsonData();
        String error = null;
        HttpSession session = request.getSession();
        System.out.println("我输入的："+valicode);
        String AutoCode = (String) session.getAttribute(RandomValidateCode.RANDOMCODEKEY);
//        System.out.println("生成的："+session.getAttribute( RandomValidateCode.RANDOMCODEKEY));
        if(AutoCode.toUpperCase().equals(valicode.toUpperCase())) {
            User login = userService.login(user);
            if(login!=null){
                PasswordHelper md = new PasswordHelper();
                String credentials = md.createCredentials(user.getLoginpass(), login.getLoginsalt());
                //未加密的密码，盐，加密后密码
                boolean b = md.checkCredentials(user.getLoginpass(), login.getLoginsalt(), login.getLoginpass());
                if(b){
                    jsonData.setCode(0);
                    jsonData.setMessage("登录成功！");
                    jsonData.setResult(login);
                }else{
                    jsonData.setCode(1);
                    jsonData.setMessage("用户名或密码错误！");
                }
            }else{
                jsonData.setCode(2);
                jsonData.setMessage("您还没有注册，快去注册吧！");
            }
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("验证码错误");
            return jsonData;
        }

//        Subject subject= SecurityUtils.getSubject();
//        UsernamePasswordToken token=new UsernamePasswordToken(username,loginpass);
//        if (remember != null) {
//            if (remember.equals("true")) {
//                //说明选择了记住我
//                token.setRememberMe(true);
//            } else {
//                token.setRememberMe(false);
//            }
//        } else {
//            token.setRememberMe(false);
//        }
//        System.out.println(token.isRememberMe());
        return jsonData;
    }

    /**
     * 根据获取到的手机号发送验证码
     * @param request
     * @param phone 获取的手机号码
     * @return
     */
    @RequestMapping(value="/sendSMS")
    @ResponseBody
    public Object sendSMS(HttpServletRequest request,String phone){
        JsonData jsonData = new JsonData();
        System.out.println(phone);
        //根据获取到的手机号发送验证码
        try {
            jsonData.setResult(GetSendSMS.getCode(request,phone));
            HttpSession session = request.getSession();
            //获取发送过去的验证码
            String sendSmsCode = (String) session.getAttribute("smsCode");

            jsonData.setCode(Integer.valueOf(sendSmsCode));
            jsonData.setMessage("已发送");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping("/register")
    @ResponseBody
    public Object doRegister(HttpServletRequest request, HttpServletResponse response, User user,String smsCode) {
        System.out.println(user);
        JsonData jsonData = new JsonData();
        User login = userService.login(user);
        System.out.println("判断用户是不是存在："+login);
        if(login==null){
            PasswordHelper md = new PasswordHelper();
            //获取盐
            String salt = md.createSalt();
            user.setLoginsalt(salt);
            //获取加密后的密码
            String credentials = md.createCredentials(user.getLoginpass(), salt);
            user.setLoginpass(credentials);
            int i = this.userService.register(user);
            if(i>0){
                jsonData.setCode(0);
                jsonData.setMessage("注册成功！");
            }else{
                jsonData.setCode(1);
                jsonData.setMessage("注册失败！");
            }
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("用户名已存在！");
        }

        return jsonData;
    }

    @RequestMapping("/applyAuthentication")
    @ResponseBody
    public Object applyAuthentication(HttpServletRequest request,StateStatus stateStatus) {
        JsonData jsonData = new JsonData();
        JsonData jsonData1 = null;
        try {
            jsonData1 = GetRealCode.getRealCode(stateStatus.getAsidcardno(),stateStatus.getAsrealname());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(jsonData1.getCodeKey().equals("0")){
            StateStatus byuserid = statusService.findByuserid(stateStatus.getAsuserid());
            request.getSession().setAttribute("jsonDataInfo",jsonData1.getResultKey());
            stateStatus.setAsid(byuserid.getAsid());
            int i = statusService.updateByPrimaryKeySelective(stateStatus);
            if(i>0){
                jsonData.setCode(0);
                jsonData.setMessage("已提交申请，待审核！");
            }else{
                jsonData.setCode(1);
                jsonData.setMessage("提交失败，请稍后重试！");
            }
        }
        return jsonData;

    }


}
