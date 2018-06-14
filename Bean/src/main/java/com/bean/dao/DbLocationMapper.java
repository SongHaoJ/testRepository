package com.bean.dao;

import com.bean.model.DbLocation;

public interface DbLocationMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLocation record);

    int insertSelective(DbLocation record);

    DbLocation selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLocation record);

    int updateByPrimaryKeyWithBLOBs(DbLocation record);

    int updateByPrimaryKey(DbLocation record);
}