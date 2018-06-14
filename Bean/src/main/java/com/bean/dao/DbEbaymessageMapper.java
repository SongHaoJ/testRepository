package com.bean.dao;

import com.bean.model.DbEbaymessage;

public interface DbEbaymessageMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessage record);

    int insertSelective(DbEbaymessage record);

    DbEbaymessage selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessage record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessage record);

    int updateByPrimaryKey(DbEbaymessage record);
}