package com.zking.core.controller;

import com.zking.core.model.AccountLog;
import com.zking.core.service.IAccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountLogController {

    @Autowired
    private IAccountLogService accountLogService;

    @RequestMapping("/listAccountLog")
    @ResponseBody
    public List<AccountLog> listAccountLog(){
        List<AccountLog> accountLogs = accountLogService.listAAccountLog();
        return  accountLogs;
    }

}
