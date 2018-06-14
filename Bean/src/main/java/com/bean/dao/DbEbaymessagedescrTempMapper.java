package com.bean.dao;

import com.bean.model.DbEbaymessagedescrTemp;

public interface DbEbaymessagedescrTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagedescrTemp record);

    int insertSelective(DbEbaymessagedescrTemp record);

    DbEbaymessagedescrTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagedescrTemp record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagedescrTemp record);
}