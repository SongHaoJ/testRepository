package com.bean.dao;

import com.bean.model.DbLable;

public interface DbLableMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLable record);

    int insertSelective(DbLable record);

    DbLable selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLable record);

    int updateByPrimaryKeyWithBLOBs(DbLable record);

    int updateByPrimaryKey(DbLable record);
}