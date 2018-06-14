package com.bean.dao;

import com.bean.model.DbSavenum;

public interface DbSavenumMapper {
    int deleteByPrimaryKey(String sku);

    int insert(DbSavenum record);

    int insertSelective(DbSavenum record);

    DbSavenum selectByPrimaryKey(String sku);

    int updateByPrimaryKeySelective(DbSavenum record);

    int updateByPrimaryKey(DbSavenum record);
}