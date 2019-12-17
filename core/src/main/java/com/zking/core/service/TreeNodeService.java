package com.zking.core.service;

import com.zking.core.model.TreeNode;

import java.util.List;

public interface TreeNodeService {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> setTreeNode(TreeNode treeNodeId);

    List<TreeNode> listAll();




}