package com.zking.core.service;

import com.zking.core.model.BorrowApply;
import com.zking.core.model.FinRepay;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IFinRepayService {
    int deleteByPrimaryKey(Long rid);

    int insert(FinRepay record);

    int insertSelective(FinRepay record);

    FinRepay selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(FinRepay record);

    int updateByPrimaryKey(FinRepay record);

    //查所有
    List<FinRepay> listFinRepay();
}