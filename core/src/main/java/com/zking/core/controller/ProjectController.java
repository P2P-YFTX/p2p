package com.zking.core.controller;

import com.zking.core.model.FinRepay;
import com.zking.core.model.Project;
import com.zking.core.service.IFinRepayService;
import com.zking.core.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class ProjectController {
    @Autowired
    private IProjectService projectService;

    @RequestMapping(value = "/listProject")
    @ResponseBody
    public List<Project> listProject(){
        List<Project> projects = projectService.listProject();
        return projects;
    }
}
