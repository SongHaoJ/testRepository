package com.bean.dao;

import com.bean.model.DbAllocateTemp;

public interface DbAllocateTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAllocateTemp record);

    int insertSelective(DbAllocateTemp record);

    DbAllocateTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAllocateTemp record);

    int updateByPrimaryKeyWithBLOBs(DbAllocateTemp record);

    int updateByPrimaryKey(DbAllocateTemp record);
}