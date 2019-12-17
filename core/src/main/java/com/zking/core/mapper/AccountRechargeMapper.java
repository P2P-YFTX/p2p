package com.zking.core.mapper;

import com.zking.core.model.AccountRecharge;

public interface AccountRechargeMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(AccountRecharge record);

    int insertSelective(AccountRecharge record);

    AccountRecharge selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(AccountRecharge record);

    int updateByPrimaryKey(AccountRecharge record);
}