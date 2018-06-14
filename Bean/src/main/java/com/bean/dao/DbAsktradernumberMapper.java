package com.bean.dao;

import com.bean.model.DbAsktradernumber;

public interface DbAsktradernumberMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAsktradernumber record);

    int insertSelective(DbAsktradernumber record);

    DbAsktradernumber selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAsktradernumber record);

    int updateByPrimaryKeyWithBLOBs(DbAsktradernumber record);

    int updateByPrimaryKey(DbAsktradernumber record);
}