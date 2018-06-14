package com.bean.dao;

import com.bean.model.DbGeneralTemp;

public interface DbGeneralTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbGeneralTemp record);

    int insertSelective(DbGeneralTemp record);

    DbGeneralTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbGeneralTemp record);

    int updateByPrimaryKeyWithBLOBs(DbGeneralTemp record);

    int updateByPrimaryKey(DbGeneralTemp record);
}