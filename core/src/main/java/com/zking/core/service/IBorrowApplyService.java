package com.zking.core.service;

import com.zking.core.model.BorrowApply;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IBorrowApplyService {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowApply record);

    int insertSelective(BorrowApply record);

    BorrowApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BorrowApply record);

    int updateByPrimaryKey(BorrowApply record);

    //查所有
    List<BorrowApply> listBorrowApply();
}