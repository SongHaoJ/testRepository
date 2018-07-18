package com.bean.dao;

import com.bean.model.DbChinaexpresslog;

public interface DbChinaexpresslogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbChinaexpresslog record);

    int insertSelective(DbChinaexpresslog record);

    DbChinaexpresslog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbChinaexpresslog record);

    int updateByPrimaryKeyWithBLOBs(DbChinaexpresslog record);

    int updateByPrimaryKey(DbChinaexpresslog record);
}