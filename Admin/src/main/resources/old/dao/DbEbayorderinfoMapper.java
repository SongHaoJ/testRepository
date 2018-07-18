package com.bean.dao;

import com.bean.model.DbEbayorderinfo;

public interface DbEbayorderinfoMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbayorderinfo record);

    int insertSelective(DbEbayorderinfo record);

    DbEbayorderinfo selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbayorderinfo record);

    int updateByPrimaryKeyWithBLOBs(DbEbayorderinfo record);

    int updateByPrimaryKey(DbEbayorderinfo record);
}