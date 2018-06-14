package com.bean.dao;

import com.bean.model.DbEbayapi;

public interface DbEbayapiMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbayapi record);

    int insertSelective(DbEbayapi record);

    DbEbayapi selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbayapi record);

    int updateByPrimaryKeyWithBLOBs(DbEbayapi record);

    int updateByPrimaryKey(DbEbayapi record);
}