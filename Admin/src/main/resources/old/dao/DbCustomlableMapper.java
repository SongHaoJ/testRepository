package com.bean.dao;

import com.bean.model.DbCustomlable;

public interface DbCustomlableMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCustomlable record);

    int insertSelective(DbCustomlable record);

    DbCustomlable selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCustomlable record);

    int updateByPrimaryKey(DbCustomlable record);
}