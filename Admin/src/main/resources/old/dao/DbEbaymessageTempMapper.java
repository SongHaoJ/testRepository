package com.bean.dao;

import com.bean.model.DbEbaymessageTemp;

public interface DbEbaymessageTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessageTemp record);

    int insertSelective(DbEbaymessageTemp record);

    DbEbaymessageTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessageTemp record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessageTemp record);

    int updateByPrimaryKey(DbEbaymessageTemp record);
}