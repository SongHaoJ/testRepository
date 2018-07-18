package com.bean.dao;

import com.bean.model.DbResultlist;

public interface DbResultlistMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbResultlist record);

    int insertSelective(DbResultlist record);

    DbResultlist selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbResultlist record);

    int updateByPrimaryKeyWithBLOBs(DbResultlist record);

    int updateByPrimaryKey(DbResultlist record);
}