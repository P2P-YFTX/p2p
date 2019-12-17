package com.zking.core.service.impl;


import com.zking.core.mapper.TreeNodeMapper;
import com.zking.core.model.TreeNode;
import com.zking.core.service.TreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class TreeNodeServiceImpl implements TreeNodeService {

    @Autowired
    private TreeNodeMapper treeNodeMapper;
    @Override
    public int deleteByPrimaryKey(Integer treeNodeId) {
        return 0;
    }

    @Override
    public int insert(TreeNode record) {
        return 0;
    }

    @Override
    public int insertSelective(TreeNode record) {
        return 0;
    }

    @Override
    public TreeNode selectByPrimaryKey(Integer treeNodeId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TreeNode record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TreeNode record) {
        return 0;
    }

    @Override
    public List<TreeNode> setTreeNode(TreeNode treeNodeId) {
        //return this.treeNodeMapper.setTreeNode(treeNodeId);
        return null;
    }

    @Override
    public List<TreeNode> listAll() {
        //return this.treeNodeMapper.listAll();
        return null;
    }
}
