package com.zking.core.service;

import com.zking.core.model.AccountBank;

import java.util.List;

public interface IAccountBankService {
    int deleteByPrimaryKey(Integer abid);

    int insert(AccountBank record);

    int insertSelective(AccountBank record);

    AccountBank selectByPrimaryKey(Integer abid);

    int updateByPrimaryKeySelective(AccountBank record);

    int updateByPrimaryKey(AccountBank record);

    //查所有
    List<AccountBank> listAccountBank();
}