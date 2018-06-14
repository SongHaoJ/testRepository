package com.bean.dao;

import com.bean.model.DbLoginfree;

public interface DbLoginfreeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLoginfree record);

    int insertSelective(DbLoginfree record);

    DbLoginfree selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLoginfree record);

    int updateByPrimaryKeyWithBLOBs(DbLoginfree record);

    int updateByPrimaryKey(DbLoginfree record);
}