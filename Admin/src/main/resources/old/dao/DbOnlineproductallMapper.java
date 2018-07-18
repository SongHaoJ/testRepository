package com.bean.dao;

import com.bean.model.DbOnlineproductall;

public interface DbOnlineproductallMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbOnlineproductall record);

    int insertSelective(DbOnlineproductall record);

    DbOnlineproductall selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbOnlineproductall record);

    int updateByPrimaryKeyWithBLOBs(DbOnlineproductall record);

    int updateByPrimaryKey(DbOnlineproductall record);
}