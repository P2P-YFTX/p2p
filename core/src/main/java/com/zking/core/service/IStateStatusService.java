package com.zking.core.service;

import com.zking.core.model.StateStatus;

public interface IStateStatusService {
    int deleteByPrimaryKey(Long asid);

    int insert(StateStatus record);

    int insertSelective(StateStatus record);

    StateStatus selectByPrimaryKey(Long asid);

    int updateByPrimaryKeySelective(StateStatus record);

    int updateByPrimaryKey(StateStatus record);

    //判断是否有实名申请
    StateStatus findByuserid(Long asuserid);

    //上传正面图片
    int insertImg(StateStatus status);

    //上传背面图片
    int insertImg2(StateStatus status);

    //身份份认证
    int applyAuthentication(StateStatus stateStatus);

}