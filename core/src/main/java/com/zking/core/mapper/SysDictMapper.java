package com.zking.core.mapper;

import com.zking.core.model.SysDict;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}