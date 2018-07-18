package com.bean.dao;

import com.bean.model.DbCalculateitem;

public interface DbCalculateitemMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCalculateitem record);

    int insertSelective(DbCalculateitem record);

    DbCalculateitem selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCalculateitem record);

    int updateByPrimaryKey(DbCalculateitem record);
}