package com.bean.dao;

import com.bean.model.DbTasktype;

public interface DbTasktypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTasktype record);

    int insertSelective(DbTasktype record);

    DbTasktype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTasktype record);

    int updateByPrimaryKeyWithBLOBs(DbTasktype record);

    int updateByPrimaryKey(DbTasktype record);
}