package com.bean.dao;

import com.bean.model.DbStorage;

public interface DbStorageMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbStorage record);

    int insertSelective(DbStorage record);

    DbStorage selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbStorage record);

    int updateByPrimaryKeyWithBLOBs(DbStorage record);

    int updateByPrimaryKey(DbStorage record);
}