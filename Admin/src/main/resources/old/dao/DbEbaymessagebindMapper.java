package com.bean.dao;

import com.bean.model.DbEbaymessagebind;

public interface DbEbaymessagebindMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagebind record);

    int insertSelective(DbEbaymessagebind record);

    DbEbaymessagebind selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagebind record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagebind record);

    int updateByPrimaryKey(DbEbaymessagebind record);
}