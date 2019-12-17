package com.zking.core.userUtil;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 短信验证
 */
public class GetSendSMS {

    //创建验证码
    public static String smsCode(){
        String random=(int)((Math.random()*9+1)*100000)+"";
        return random;
    }

    public static String getCode(HttpServletRequest request, String phone) throws Exception {
        String smscode = smsCode();
        String host = "https://feginesms.market.alicloudapi.com";
        String path = "/codeNotice";
        String method = "GET";
        String appcode = "47aeb3d9e1f74ba1835c198889150cfa";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("param", smscode);
        querys.put("phone", phone);
        querys.put("sign", "2");
        querys.put("skin", "1");
        //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/Tools.zip
        request.getSession().removeAttribute("smsCode");
        request.getSession().setAttribute("smsCode",smscode);

        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
//            System.out.println(response.toString());//如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

}
