package com.zking.core.service.impl;

import com.zking.core.mapper.AccountRechargeMapper;
import com.zking.core.model.AccountRecharge;
import com.zking.core.service.IAccountRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AccountRechargeServiceImpl implements IAccountRechargeService {

    @Autowired
    private AccountRechargeMapper accountRechargeMapper;

    @Override
    public int deleteByPrimaryKey(Integer rid) {
        return 0;
    }

    @Override
    public int insert(AccountRecharge record) {
        return 0;
    }

    @Override
    public int insertSelective(AccountRecharge record) {
        return 0;
    }

    @Override
    public AccountRecharge selectByPrimaryKey(Integer rid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AccountRecharge record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccountRecharge record) {
        return 0;
    }

    @Override
    public List<AccountRecharge> listAccountRecharge() {
        //return accountRechargeMapper.listAccountRecharge();
        return null;
    }
}
