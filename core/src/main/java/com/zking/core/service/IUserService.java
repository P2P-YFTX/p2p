package com.zking.core.service;

import com.zking.core.model.User;
import org.springframework.stereotype.Repository;

public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //登录
    User login(User user);

    //注册
    int register(User user);

    /**
     * 修改绑定手机号
     * @param user
     * @return
     */
    int updatePhone(User user);

    /**
     * 修改绑定邮箱
     * @param user
     * @return
     */
    int updateEmail(User user);

}