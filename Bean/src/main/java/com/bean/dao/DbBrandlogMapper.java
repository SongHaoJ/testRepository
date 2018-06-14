package com.bean.dao;

import com.bean.model.DbBrandlog;

public interface DbBrandlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbBrandlog record);

    int insertSelective(DbBrandlog record);

    DbBrandlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbBrandlog record);

    int updateByPrimaryKeyWithBLOBs(DbBrandlog record);

    int updateByPrimaryKey(DbBrandlog record);
}