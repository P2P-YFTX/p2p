package com.zking.core.controller;

import com.zking.core.model.AccountBank;
import com.zking.core.model.AccountCash;
import com.zking.core.service.IAccountBankService;
import com.zking.core.service.IAccountCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountCashController {

        @Autowired
        private IAccountCashService accountCashService;

        @RequestMapping("/listAccountCash")
        @ResponseBody
        public List<AccountCash> listAccountCash() {
            List<AccountCash> accountCashes = accountCashService.listAccountCash();
            return accountCashes;
        }

    }
