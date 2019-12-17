package com.zking.core.mapper;

import com.zking.core.model.AccountBank;

public interface AccountBankMapper {
    int deleteByPrimaryKey(Integer abid);

    int insert(AccountBank record);

    int insertSelective(AccountBank record);

    AccountBank selectByPrimaryKey(Integer abid);

    int updateByPrimaryKeySelective(AccountBank record);

    int updateByPrimaryKey(AccountBank record);
}