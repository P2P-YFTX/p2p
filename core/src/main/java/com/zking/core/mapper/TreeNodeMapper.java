package com.zking.core.mapper;

import com.zking.core.model.TreeNode;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);
}