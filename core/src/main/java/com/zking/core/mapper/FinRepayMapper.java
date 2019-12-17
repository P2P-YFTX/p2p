package com.zking.core.mapper;

import com.zking.core.model.FinRepay;

public interface FinRepayMapper {
    int deleteByPrimaryKey(Long rid);

    int insert(FinRepay record);

    int insertSelective(FinRepay record);

    FinRepay selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(FinRepay record);

    int updateByPrimaryKey(FinRepay record);
}