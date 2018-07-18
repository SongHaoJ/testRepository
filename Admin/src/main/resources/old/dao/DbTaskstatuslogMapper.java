package com.bean.dao;

import com.bean.model.DbTaskstatuslog;

public interface DbTaskstatuslogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTaskstatuslog record);

    int insertSelective(DbTaskstatuslog record);

    DbTaskstatuslog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTaskstatuslog record);

    int updateByPrimaryKeyWithBLOBs(DbTaskstatuslog record);

    int updateByPrimaryKey(DbTaskstatuslog record);
}