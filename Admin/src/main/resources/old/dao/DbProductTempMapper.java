package com.bean.dao;

import com.bean.model.DbProductTemp;

public interface DbProductTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductTemp record);

    int insertSelective(DbProductTemp record);

    DbProductTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductTemp record);

    int updateByPrimaryKeyWithBLOBs(DbProductTemp record);

    int updateByPrimaryKey(DbProductTemp record);
}