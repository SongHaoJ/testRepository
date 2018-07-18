package com.bean.dao;

import com.bean.model.DbEbaysite;

public interface DbEbaysiteMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbEbaysite record);

    int insertSelective(DbEbaysite record);

    DbEbaysite selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbEbaysite record);

    int updateByPrimaryKey(DbEbaysite record);
}