package com.bean.dao;

import com.bean.model.DbSendmessage;

public interface DbSendmessageMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSendmessage record);

    int insertSelective(DbSendmessage record);

    DbSendmessage selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSendmessage record);

    int updateByPrimaryKeyWithBLOBs(DbSendmessage record);

    int updateByPrimaryKey(DbSendmessage record);
}