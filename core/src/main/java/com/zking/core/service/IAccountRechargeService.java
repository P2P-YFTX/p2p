package com.zking.core.service;

import com.zking.core.model.AccountRecharge;

import java.util.List;

public interface IAccountRechargeService {
    int deleteByPrimaryKey(Integer rid);

    int insert(AccountRecharge record);

    int insertSelective(AccountRecharge record);

    AccountRecharge selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(AccountRecharge record);

    int updateByPrimaryKey(AccountRecharge record);

    //查所有
    List<AccountRecharge> listAccountRecharge();
}