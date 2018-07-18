package com.bean.dao;

import com.bean.model.DbOrderTemp;

public interface DbOrderTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbOrderTemp record);

    int insertSelective(DbOrderTemp record);

    DbOrderTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbOrderTemp record);

    int updateByPrimaryKeyWithBLOBs(DbOrderTemp record);

    int updateByPrimaryKey(DbOrderTemp record);
}