package com.zking.core.mapper;

import com.zking.core.model.BorrowApply;

public interface BorrowApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowApply record);

    int insertSelective(BorrowApply record);

    BorrowApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BorrowApply record);

    int updateByPrimaryKey(BorrowApply record);
}