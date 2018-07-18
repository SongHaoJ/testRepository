package com.bean.dao;

import com.bean.model.DbEbaymessagecontent;

public interface DbEbaymessagecontentMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagecontent record);

    int insertSelective(DbEbaymessagecontent record);

    DbEbaymessagecontent selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagecontent record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagecontent record);
}