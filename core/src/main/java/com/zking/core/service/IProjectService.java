package com.zking.core.service;

import com.zking.core.model.Project;

import java.util.List;

public interface IProjectService {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    //查所有
    List<Project> listProject();
}