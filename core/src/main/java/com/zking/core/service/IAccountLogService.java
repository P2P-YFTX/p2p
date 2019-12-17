package com.zking.core.service;

import com.zking.core.model.AccountLog;

import java.util.List;

public interface IAccountLogService {
    int deleteByPrimaryKey(Integer logid);

    int insert(AccountLog record);

    int insertSelective(AccountLog record);

    AccountLog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(AccountLog record);

    int updateByPrimaryKey(AccountLog record);

    List<AccountLog> listAAccountLog();

}