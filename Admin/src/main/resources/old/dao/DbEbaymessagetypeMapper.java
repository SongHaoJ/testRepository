package com.bean.dao;

import com.bean.model.DbEbaymessagetype;

public interface DbEbaymessagetypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbaymessagetype record);

    int insertSelective(DbEbaymessagetype record);

    DbEbaymessagetype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbaymessagetype record);

    int updateByPrimaryKeyWithBLOBs(DbEbaymessagetype record);

    int updateByPrimaryKey(DbEbaymessagetype record);
}