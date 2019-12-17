package com.zking.core.controller;

import com.zking.core.model.AccountBank;
import com.zking.core.model.AccountLog;
import com.zking.core.service.IAccountBankService;
import com.zking.core.service.IAccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountBankController {
    @Autowired
    private IAccountBankService accountBankService;

    @RequestMapping("/listAccountBank")
    @ResponseBody
   public List<AccountBank> listAccountBank(){
        List<AccountBank> accountBanks = accountBankService.listAccountBank();
        return accountBanks;
    }

}
