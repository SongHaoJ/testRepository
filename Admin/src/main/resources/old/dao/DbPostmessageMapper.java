package com.bean.dao;

import com.bean.model.DbPostmessage;

public interface DbPostmessageMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPostmessage record);

    int insertSelective(DbPostmessage record);

    DbPostmessage selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPostmessage record);

    int updateByPrimaryKeyWithBLOBs(DbPostmessage record);

    int updateByPrimaryKey(DbPostmessage record);
}