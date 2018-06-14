package com.bean.dao;

import com.bean.model.DbPaypalTemp;

public interface DbPaypalTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPaypalTemp record);

    int insertSelective(DbPaypalTemp record);

    DbPaypalTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPaypalTemp record);

    int updateByPrimaryKeyWithBLOBs(DbPaypalTemp record);

    int updateByPrimaryKey(DbPaypalTemp record);
}