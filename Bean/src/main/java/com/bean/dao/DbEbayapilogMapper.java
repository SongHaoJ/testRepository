package com.bean.dao;

import com.bean.model.DbEbayapilog;

public interface DbEbayapilogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbayapilog record);

    int insertSelective(DbEbayapilog record);

    DbEbayapilog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbayapilog record);

    int updateByPrimaryKeyWithBLOBs(DbEbayapilog record);

    int updateByPrimaryKey(DbEbayapilog record);
}