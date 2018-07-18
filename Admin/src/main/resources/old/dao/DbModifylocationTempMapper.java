package com.bean.dao;

import com.bean.model.DbModifylocationTemp;

public interface DbModifylocationTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbModifylocationTemp record);

    int insertSelective(DbModifylocationTemp record);

    DbModifylocationTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbModifylocationTemp record);

    int updateByPrimaryKeyWithBLOBs(DbModifylocationTemp record);

    int updateByPrimaryKey(DbModifylocationTemp record);
}