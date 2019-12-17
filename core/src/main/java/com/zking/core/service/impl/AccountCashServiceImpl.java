package com.zking.core.service.impl;

import com.zking.core.mapper.AccountCashMapper;
import com.zking.core.model.AccountCash;
import com.zking.core.service.IAccountCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountCashServiceImpl implements IAccountCashService {
    @Autowired
    private AccountCashMapper accountCashMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return 0;
    }

    @Override
    public int insert(AccountCash record) {
        return 0;
    }

    @Override
    public int insertSelective(AccountCash record) {
        return 0;
    }

    @Override
    public AccountCash selectByPrimaryKey(Integer cid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AccountCash record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccountCash record) {
        return 0;
    }

    @Override
    public List<AccountCash> listAccountCash() {
        //return accountCashMapper.listAccountCash();
        return null;
    }
}
