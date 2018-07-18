package com.bean.dao;

import com.bean.model.DbPlatform;

public interface DbPlatformMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPlatform record);

    int insertSelective(DbPlatform record);

    DbPlatform selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPlatform record);

    int updateByPrimaryKeyWithBLOBs(DbPlatform record);

    int updateByPrimaryKey(DbPlatform record);
}