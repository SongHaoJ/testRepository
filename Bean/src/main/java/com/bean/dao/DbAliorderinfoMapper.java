package com.bean.dao;

import com.bean.model.DbAliorderinfo;

public interface DbAliorderinfoMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAliorderinfo record);

    int insertSelective(DbAliorderinfo record);

    DbAliorderinfo selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAliorderinfo record);

    int updateByPrimaryKeyWithBLOBs(DbAliorderinfo record);

    int updateByPrimaryKey(DbAliorderinfo record);
}