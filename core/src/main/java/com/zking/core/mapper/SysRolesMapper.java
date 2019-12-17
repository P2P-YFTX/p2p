package com.zking.core.mapper;

import com.zking.core.model.SysRoles;

public interface SysRolesMapper {
    int deleteByPrimaryKey(Long srid);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    SysRoles selectByPrimaryKey(Long srid);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}