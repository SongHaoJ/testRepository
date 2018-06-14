package com.bean.dao;

import com.bean.model.DbBirdcountry;

public interface DbBirdcountryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBirdcountry record);

    int insertSelective(DbBirdcountry record);

    DbBirdcountry selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBirdcountry record);

    int updateByPrimaryKey(DbBirdcountry record);
}