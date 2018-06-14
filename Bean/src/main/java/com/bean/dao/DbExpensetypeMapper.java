package com.bean.dao;

import com.bean.model.DbExpensetype;

public interface DbExpensetypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpensetype record);

    int insertSelective(DbExpensetype record);

    DbExpensetype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpensetype record);

    int updateByPrimaryKeyWithBLOBs(DbExpensetype record);

    int updateByPrimaryKey(DbExpensetype record);
}