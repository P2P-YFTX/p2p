package com.zking.core.mapper;

import com.zking.core.model.AccountLog;

public interface AccountLogMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(AccountLog record);

    int insertSelective(AccountLog record);

    AccountLog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(AccountLog record);

    int updateByPrimaryKey(AccountLog record);
}