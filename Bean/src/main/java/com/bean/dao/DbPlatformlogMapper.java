package com.bean.dao;

import com.bean.model.DbPlatformlog;

public interface DbPlatformlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPlatformlog record);

    int insertSelective(DbPlatformlog record);

    DbPlatformlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPlatformlog record);

    int updateByPrimaryKeyWithBLOBs(DbPlatformlog record);

    int updateByPrimaryKey(DbPlatformlog record);
}