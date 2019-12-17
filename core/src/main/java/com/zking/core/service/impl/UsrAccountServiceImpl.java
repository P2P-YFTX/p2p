package com.zking.core.service.impl;

import com.zking.core.mapper.UsrAccountMapper;
import com.zking.core.model.UsrAccount;
import com.zking.core.service.IUsrAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UsrAccountServiceImpl implements IUsrAccountService {

    @Autowired
    private UsrAccountMapper usrAccountMapper;

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return 0;
    }

    @Override
    public int insert(UsrAccount record) {
        return 0;
    }

    @Override
    public int insertSelective(UsrAccount record) {
        return 0;
    }

    @Override
    public UsrAccount selectByPrimaryKey(Integer aid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UsrAccount record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UsrAccount record) {
        return 0;
    }

    @Override
    public Map listUsrAccount(Integer userid) {
        return usrAccountMapper.listUsrAccount(userid);
    }
}
