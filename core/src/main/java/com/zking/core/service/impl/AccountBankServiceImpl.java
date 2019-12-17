package com.zking.core.service.impl;

import com.zking.core.mapper.AccountBankMapper;
import com.zking.core.model.AccountBank;
import com.zking.core.service.IAccountBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountBankServiceImpl implements IAccountBankService {

    @Autowired
    private AccountBankMapper accountBankMapper;
    @Override
    public int deleteByPrimaryKey(Integer abid) {
        return 0;
    }

    @Override
    public int insert(AccountBank record) {
        return 0;
    }

    @Override
    public int insertSelective(AccountBank record) {
        return 0;
    }

    @Override
    public AccountBank selectByPrimaryKey(Integer abid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AccountBank record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccountBank record) {
        return 0;
    }

    @Override
    public List<AccountBank> listAccountBank() {
        //return accountBankMapper.listAccountBank();
        return null;
    }
}
