package com.bean.dao;

import com.bean.model.DbYwcountry;

public interface DbYwcountryMapper {
    int deleteByPrimaryKey(String name);

    int insert(DbYwcountry record);

    int insertSelective(DbYwcountry record);

    DbYwcountry selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(DbYwcountry record);

    int updateByPrimaryKeyWithBLOBs(DbYwcountry record);

    int updateByPrimaryKey(DbYwcountry record);
}