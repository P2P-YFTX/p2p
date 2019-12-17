package com.zking.core.mapper;

import com.zking.core.model.SysPermissionMenu;

public interface SysPermissionMenuMapper {
    int deleteByPrimaryKey(Long spmid);

    int insert(SysPermissionMenu record);

    int insertSelective(SysPermissionMenu record);

    SysPermissionMenu selectByPrimaryKey(Long spmid);

    int updateByPrimaryKeySelective(SysPermissionMenu record);

    int updateByPrimaryKey(SysPermissionMenu record);
}