package com.zking.core.service.impl;

import com.zking.core.mapper.ProjectMapper;
import com.zking.core.model.Project;
import com.zking.core.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Project record) {
        return 0;
    }

    @Override
    public int insertSelective(Project record) {
        return 0;
    }

    @Override
    public Project selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return 0;
    }

    @Override
    public List<Project> listProject() {
        //return projectMapper.listProject();
        return null;
    }
}
