package com.bean.dao;

import com.bean.model.DbChinaexpress;

public interface DbChinaexpressMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbChinaexpress record);

    int insertSelective(DbChinaexpress record);

    DbChinaexpress selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbChinaexpress record);

    int updateByPrimaryKeyWithBLOBs(DbChinaexpress record);

    int updateByPrimaryKey(DbChinaexpress record);
}