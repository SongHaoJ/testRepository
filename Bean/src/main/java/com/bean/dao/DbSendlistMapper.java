package com.bean.dao;

import com.bean.model.DbSendlist;

public interface DbSendlistMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSendlist record);

    int insertSelective(DbSendlist record);

    DbSendlist selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSendlist record);

    int updateByPrimaryKeyWithBLOBs(DbSendlist record);

    int updateByPrimaryKey(DbSendlist record);
}