package com.bean.dao;

import com.bean.model.DbBpostcountry;

public interface DbBpostcountryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBpostcountry record);

    int insertSelective(DbBpostcountry record);

    DbBpostcountry selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBpostcountry record);

    int updateByPrimaryKey(DbBpostcountry record);
}