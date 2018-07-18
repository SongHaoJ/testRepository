package com.bean.dao;

import com.bean.model.DbEbaymessageconfiglog;

public interface DbEbaymessageconfiglogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessageconfiglog record);

    int insertSelective(DbEbaymessageconfiglog record);

    DbEbaymessageconfiglog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessageconfiglog record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessageconfiglog record);

    int updateByPrimaryKey(DbEbaymessageconfiglog record);
}