package com.zking.core.controller;

import com.zking.core.model.TreeNode;

import com.zking.core.service.TreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import java.util.List;

@Controller
public class TreeNodecontorller  {



@Autowired
    private TreeNodeService treeNodeService;



    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<TreeNode> listAll(){

        List<TreeNode> treeNodelist = treeNodeService.listAll();
        return treeNodelist;
    }







}
