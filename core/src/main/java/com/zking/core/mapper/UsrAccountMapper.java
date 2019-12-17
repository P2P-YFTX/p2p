package com.zking.core.mapper;

import com.zking.core.model.UsrAccount;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UsrAccountMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(UsrAccount record);

    int insertSelective(UsrAccount record);

    UsrAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(UsrAccount record);

    int updateByPrimaryKey(UsrAccount record);

    Map listUsrAccount(Integer userid);
}