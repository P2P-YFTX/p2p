package com.zking.core.mapper;

import com.zking.core.model.AccountCash;

public interface AccountCashMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(AccountCash record);

    int insertSelective(AccountCash record);

    AccountCash selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(AccountCash record);

    int updateByPrimaryKey(AccountCash record);
}