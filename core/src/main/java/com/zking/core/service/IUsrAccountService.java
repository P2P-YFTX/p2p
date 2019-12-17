package com.zking.core.service;

import com.zking.core.model.UsrAccount;

import java.util.List;
import java.util.Map;

public interface IUsrAccountService {
    int deleteByPrimaryKey(Integer aid);

    int insert(UsrAccount record);

    int insertSelective(UsrAccount record);

    UsrAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(UsrAccount record);

    int updateByPrimaryKey(UsrAccount record);

    Map listUsrAccount(Integer userid);
}