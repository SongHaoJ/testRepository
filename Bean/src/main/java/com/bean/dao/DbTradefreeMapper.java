package com.bean.dao;

import com.bean.model.DbTradefree;

public interface DbTradefreeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTradefree record);

    int insertSelective(DbTradefree record);

    DbTradefree selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTradefree record);

    int updateByPrimaryKeyWithBLOBs(DbTradefree record);

    int updateByPrimaryKey(DbTradefree record);
}