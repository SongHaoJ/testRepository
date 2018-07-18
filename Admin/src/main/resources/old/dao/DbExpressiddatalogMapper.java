package com.bean.dao;

import com.bean.model.DbExpressiddatalog;

public interface DbExpressiddatalogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpressiddatalog record);

    int insertSelective(DbExpressiddatalog record);

    DbExpressiddatalog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpressiddatalog record);

    int updateByPrimaryKeyWithBLOBs(DbExpressiddatalog record);

    int updateByPrimaryKey(DbExpressiddatalog record);
}