package com.bean.dao;

import com.bean.model.DbEbaymessageorderconfiglog;

public interface DbEbaymessageorderconfiglogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessageorderconfiglog record);

    int insertSelective(DbEbaymessageorderconfiglog record);

    DbEbaymessageorderconfiglog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessageorderconfiglog record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessageorderconfiglog record);

    int updateByPrimaryKey(DbEbaymessageorderconfiglog record);
}