package com.bean.dao;

import com.bean.model.DbProducttypeset;

public interface DbProducttypesetMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProducttypeset record);

    int insertSelective(DbProducttypeset record);

    DbProducttypeset selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProducttypeset record);

    int updateByPrimaryKey(DbProducttypeset record);
}