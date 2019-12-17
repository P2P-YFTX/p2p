package com.zking.core.mapper;

import com.zking.core.model.UsrInfo;

public interface UsrInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UsrInfo record);

    int insertSelective(UsrInfo record);

    UsrInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UsrInfo record);

    int updateByPrimaryKey(UsrInfo record);


}