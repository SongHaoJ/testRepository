package com.bean.dao;

import com.bean.model.DbEbaymessageorderconfig;

public interface DbEbaymessageorderconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessageorderconfig record);

    int insertSelective(DbEbaymessageorderconfig record);

    DbEbaymessageorderconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessageorderconfig record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessageorderconfig record);

    int updateByPrimaryKey(DbEbaymessageorderconfig record);
}