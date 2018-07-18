package com.bean.dao;

import com.bean.model.DbProductanditemid;

public interface DbProductanditemidMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductanditemid record);

    int insertSelective(DbProductanditemid record);

    DbProductanditemid selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductanditemid record);

    int updateByPrimaryKey(DbProductanditemid record);
}