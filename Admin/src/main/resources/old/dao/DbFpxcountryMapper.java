package com.bean.dao;

import com.bean.model.DbFpxcountry;

public interface DbFpxcountryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFpxcountry record);

    int insertSelective(DbFpxcountry record);

    DbFpxcountry selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFpxcountry record);

    int updateByPrimaryKey(DbFpxcountry record);
}