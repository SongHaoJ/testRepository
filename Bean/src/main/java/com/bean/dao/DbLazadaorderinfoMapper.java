package com.bean.dao;

import com.bean.model.DbLazadaorderinfo;

public interface DbLazadaorderinfoMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLazadaorderinfo record);

    int insertSelective(DbLazadaorderinfo record);

    DbLazadaorderinfo selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLazadaorderinfo record);

    int updateByPrimaryKeyWithBLOBs(DbLazadaorderinfo record);

    int updateByPrimaryKey(DbLazadaorderinfo record);
}