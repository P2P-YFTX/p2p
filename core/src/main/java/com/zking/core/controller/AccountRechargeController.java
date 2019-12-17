package com.zking.core.controller;

import com.zking.core.model.AccountLog;
import com.zking.core.model.AccountRecharge;
import com.zking.core.service.IAccountLogService;
import com.zking.core.service.IAccountRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountRechargeController {
    @Autowired
    private IAccountRechargeService accountRechargeService;

    @RequestMapping("/listAccountRecharge")
    @ResponseBody
    public List<AccountRecharge> listAccountRecharge(){
        List<AccountRecharge> accountRecharges = accountRechargeService.listAccountRecharge();
        return  accountRecharges;
    }
}
