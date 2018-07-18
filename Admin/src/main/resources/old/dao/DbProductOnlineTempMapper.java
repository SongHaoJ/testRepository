package com.bean.dao;

import com.bean.model.DbProductOnlineTemp;

public interface DbProductOnlineTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductOnlineTemp record);

    int insertSelective(DbProductOnlineTemp record);

    DbProductOnlineTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductOnlineTemp record);

    int updateByPrimaryKeyWithBLOBs(DbProductOnlineTemp record);

    int updateByPrimaryKey(DbProductOnlineTemp record);
}