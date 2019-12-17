package com.zking.core.controller;

import com.zking.core.model.User;
import com.zking.core.service.IUserService;
import com.zking.core.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/updatePhone")
    @ResponseBody
    public Object updatePhone(@Validated User user){
        JsonData jsonData=new JsonData();
        int i = userService.updatePhone(user);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("修改手机号成功");
        }else{
            jsonData.setCode(1);
            jsonData.setMessage("修改手机号失败");
        }
        return jsonData;
    }

    @RequestMapping(value = "/updateEmail")
    @ResponseBody
    public Object updateEmail(@Validated User user){
        JsonData jsonData=new JsonData();
        int i = userService.updateEmail(user);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("修改邮箱成功");
        }else{
            jsonData.setCode(1);
            jsonData.setMessage("修改邮箱失败");
        }
        return jsonData;
    }
}
