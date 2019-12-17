package com.zking.core.service.impl;

import com.zking.core.mapper.StateStatusMapper;
import com.zking.core.model.StateStatus;
import com.zking.core.service.IStateStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateStatusServiceImpl implements IStateStatusService {
    @Autowired
    private StateStatusMapper stateStatusMapper;

    @Override
    public int deleteByPrimaryKey(Long asid) {
        return 0;
    }

    @Override
    public int insert(StateStatus record) {
        return 0;
    }

    @Override
    public int insertSelective(StateStatus record) {
        return 0;
    }

    @Override
    public StateStatus selectByPrimaryKey(Long asid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StateStatus record) {
        return stateStatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StateStatus record) {
        return 0;
    }

    @Override
    public StateStatus findByuserid(Long asuserid) {
        return stateStatusMapper.findByuserid(asuserid);
    }

    @Override
    public int insertImg(StateStatus status) {
        return stateStatusMapper.insertImg(status);
    }

    @Override
    public int insertImg2(StateStatus status) {
        return stateStatusMapper.insertImg2(status);
    }

    @Override
    public int applyAuthentication(StateStatus stateStatus) {
        return stateStatusMapper.applyAuthentication(stateStatus);
    }
}
