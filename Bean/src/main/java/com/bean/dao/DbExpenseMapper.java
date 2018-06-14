package com.bean.dao;

import com.bean.model.DbExpense;

public interface DbExpenseMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpense record);

    int insertSelective(DbExpense record);

    DbExpense selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpense record);

    int updateByPrimaryKeyWithBLOBs(DbExpense record);

    int updateByPrimaryKey(DbExpense record);
}