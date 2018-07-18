package com.bean.dao;

import com.bean.model.DbPaypalconfig;

public interface DbPaypalconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPaypalconfig record);

    int insertSelective(DbPaypalconfig record);

    DbPaypalconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPaypalconfig record);

    int updateByPrimaryKeyWithBLOBs(DbPaypalconfig record);

    int updateByPrimaryKey(DbPaypalconfig record);
}