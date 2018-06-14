package com.bean.dao;

import com.bean.model.DbEbaymessageconfig;

public interface DbEbaymessageconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessageconfig record);

    int insertSelective(DbEbaymessageconfig record);

    DbEbaymessageconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessageconfig record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessageconfig record);

    int updateByPrimaryKey(DbEbaymessageconfig record);
}