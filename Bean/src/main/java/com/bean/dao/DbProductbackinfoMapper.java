package com.bean.dao;

import com.bean.model.DbProductbackinfo;

public interface DbProductbackinfoMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductbackinfo record);

    int insertSelective(DbProductbackinfo record);

    DbProductbackinfo selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductbackinfo record);

    int updateByPrimaryKeyWithBLOBs(DbProductbackinfo record);

    int updateByPrimaryKey(DbProductbackinfo record);
}