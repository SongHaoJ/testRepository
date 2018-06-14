package com.bean.dao;

import com.bean.model.DbFpxconfig;

public interface DbFpxconfigMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFpxconfig record);

    int insertSelective(DbFpxconfig record);

    DbFpxconfig selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFpxconfig record);

    int updateByPrimaryKey(DbFpxconfig record);
}