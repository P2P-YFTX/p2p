package com.zking.core.service.impl;

import com.zking.core.mapper.FinRepayMapper;
import com.zking.core.model.BorrowApply;
import com.zking.core.model.FinRepay;
import com.zking.core.service.IFinRepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FinRepayServiceImpl implements IFinRepayService {
    @Autowired
    private FinRepayMapper repayMapper;

    @Override
    public int deleteByPrimaryKey(Long rid) {
        return 0;
    }

    @Override
    public int insert(FinRepay record) {
        return 0;
    }

    @Override
    public int insertSelective(FinRepay record) {
        return 0;
    }

    @Override
    public FinRepay selectByPrimaryKey(Long rid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(FinRepay record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(FinRepay record) {
        return 0;
    }

    @Override
    public List<FinRepay> listFinRepay() {
        //return repayMapper.listFinRepay();
        return null;
    }
}
