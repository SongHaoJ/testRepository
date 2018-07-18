package com.bean.dao;

import com.bean.model.DbExpressiddata;

public interface DbExpressiddataMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbExpressiddata record);

    int insertSelective(DbExpressiddata record);

    DbExpressiddata selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbExpressiddata record);

    int updateByPrimaryKeyWithBLOBs(DbExpressiddata record);

    int updateByPrimaryKey(DbExpressiddata record);
}