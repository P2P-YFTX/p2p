package com.zking.core.controller;

import com.zking.core.model.Project;
import com.zking.core.model.UsrAccount;
import com.zking.core.service.IProjectService;
import com.zking.core.service.IUsrAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class UsrAccountController {
    @Autowired
    private IUsrAccountService usrAccountService;

    @RequestMapping(value = "/listUsrAccount")
    @ResponseBody
    public Map listUsrAccount(){

        Map usrAccounts = usrAccountService.listUsrAccount(10011);
        return usrAccounts;
    }
}
