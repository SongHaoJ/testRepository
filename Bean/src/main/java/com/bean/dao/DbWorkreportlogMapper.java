package com.bean.dao;

import com.bean.model.DbWorkreportlog;

public interface DbWorkreportlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbWorkreportlog record);

    int insertSelective(DbWorkreportlog record);

    DbWorkreportlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbWorkreportlog record);

    int updateByPrimaryKeyWithBLOBs(DbWorkreportlog record);

    int updateByPrimaryKey(DbWorkreportlog record);
}