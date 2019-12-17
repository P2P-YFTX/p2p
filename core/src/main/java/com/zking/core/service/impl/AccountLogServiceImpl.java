package com.zking.core.service.impl;

import com.zking.core.mapper.AccountLogMapper;
import com.zking.core.model.AccountLog;
import com.zking.core.service.IAccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountLogServiceImpl implements IAccountLogService {

    @Autowired
    private AccountLogMapper accountLogMapper;


    @Override
    public int deleteByPrimaryKey(Integer logid) {
        return 0;
    }

    @Override
    public int insert(AccountLog record) {
        return 0;
    }

    @Override
    public int insertSelective(AccountLog record) {
        return 0;
    }

    @Override
    public AccountLog selectByPrimaryKey(Integer logid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AccountLog record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccountLog record) {
        return 0;
    }

    @Override
    public List<AccountLog> listAAccountLog() {
        //return accountLogMapper.listAAccountLog();
        return null;
    }
}
