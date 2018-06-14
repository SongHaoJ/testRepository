package com.bean.dao;

import com.bean.model.DbEbaymessagedescr;

public interface DbEbaymessagedescrMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagedescr record);

    int insertSelective(DbEbaymessagedescr record);

    DbEbaymessagedescr selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagedescr record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagedescr record);
}