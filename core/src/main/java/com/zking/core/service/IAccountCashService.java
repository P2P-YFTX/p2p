package com.zking.core.service;

import com.zking.core.model.AccountCash;

import java.util.List;

public interface IAccountCashService {
    int deleteByPrimaryKey(Integer cid);

    int insert(AccountCash record);

    int insertSelective(AccountCash record);

    AccountCash selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(AccountCash record);

    int updateByPrimaryKey(AccountCash record);

    //查所有
    List<AccountCash> listAccountCash();
}