package com.zking.core.service.impl;

import com.zking.core.mapper.UserMapper;
import com.zking.core.model.User;
import com.zking.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public int updatePhone(User user) {
        return userMapper.updatePhone(user);
    }

    @Override
    public int updateEmail(User user) {
        return userMapper.updateEmail(user);
    }
}
