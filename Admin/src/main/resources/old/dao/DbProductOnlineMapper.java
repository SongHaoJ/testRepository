package com.bean.dao;

import com.bean.model.DbProductOnline;

public interface DbProductOnlineMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductOnline record);

    int insertSelective(DbProductOnline record);

    DbProductOnline selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductOnline record);

    int updateByPrimaryKeyWithBLOBs(DbProductOnline record);

    int updateByPrimaryKey(DbProductOnline record);
}