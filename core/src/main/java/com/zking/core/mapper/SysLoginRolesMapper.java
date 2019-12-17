package com.zking.core.mapper;

import com.zking.core.model.SysLoginRoles;

public interface SysLoginRolesMapper {
    int deleteByPrimaryKey(Long slrid);

    int insert(SysLoginRoles record);

    int insertSelective(SysLoginRoles record);

    SysLoginRoles selectByPrimaryKey(Long slrid);

    int updateByPrimaryKeySelective(SysLoginRoles record);

    int updateByPrimaryKey(SysLoginRoles record);
}