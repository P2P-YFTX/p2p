package com.zking.core.service.impl;

import com.zking.core.mapper.BorrowApplyMapper;
import com.zking.core.model.BorrowApply;
import com.zking.core.service.IBorrowApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BorrowApplyServiceImpl implements IBorrowApplyService {
   @Autowired
   private BorrowApplyMapper borrowApplyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(BorrowApply record) {
        return 0;
    }

    @Override
    public int insertSelective(BorrowApply record) {
        return 0;
    }

    @Override
    public BorrowApply selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BorrowApply record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BorrowApply record) {
        return 0;
    }

    @Override
    public List<BorrowApply> listBorrowApply() {
        //return borrowApplyMapper.listBorrowApply();
        return null;
    }
}
