package com.zking.core.mapper;

import com.zking.core.model.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long spid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long spid);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}