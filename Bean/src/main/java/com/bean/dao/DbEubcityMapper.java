package com.bean.dao;

import com.bean.model.DbEubcity;

public interface DbEubcityMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(DbEubcity record);

    int insertSelective(DbEubcity record);

    DbEubcity selectByPrimaryKey(String cityid);

    int updateByPrimaryKeySelective(DbEubcity record);

    int updateByPrimaryKey(DbEubcity record);
}