package com.bean.dao;

import com.bean.model.DbExpensetypelog;

public interface DbExpensetypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpensetypelog record);

    int insertSelective(DbExpensetypelog record);

    DbExpensetypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpensetypelog record);

    int updateByPrimaryKeyWithBLOBs(DbExpensetypelog record);

    int updateByPrimaryKey(DbExpensetypelog record);
}