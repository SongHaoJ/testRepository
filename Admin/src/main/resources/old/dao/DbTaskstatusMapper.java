package com.bean.dao;

import com.bean.model.DbTaskstatus;

public interface DbTaskstatusMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTaskstatus record);

    int insertSelective(DbTaskstatus record);

    DbTaskstatus selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTaskstatus record);

    int updateByPrimaryKeyWithBLOBs(DbTaskstatus record);

    int updateByPrimaryKey(DbTaskstatus record);
}