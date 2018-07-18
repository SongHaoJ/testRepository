package com.bean.dao;

import com.bean.model.DbExpenselog;

public interface DbExpenselogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpenselog record);

    int insertSelective(DbExpenselog record);

    DbExpenselog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpenselog record);

    int updateByPrimaryKeyWithBLOBs(DbExpenselog record);

    int updateByPrimaryKey(DbExpenselog record);
}