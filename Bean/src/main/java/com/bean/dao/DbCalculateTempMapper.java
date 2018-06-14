package com.bean.dao;

import com.bean.model.DbCalculateTemp;

public interface DbCalculateTempMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCalculateTemp record);

    int insertSelective(DbCalculateTemp record);

    DbCalculateTemp selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCalculateTemp record);

    int updateByPrimaryKey(DbCalculateTemp record);
}