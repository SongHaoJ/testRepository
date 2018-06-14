package com.bean.dao;

import com.bean.model.DbOnlineproduct;

public interface DbOnlineproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbOnlineproduct record);

    int insertSelective(DbOnlineproduct record);

    DbOnlineproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbOnlineproduct record);

    int updateByPrimaryKeyWithBLOBs(DbOnlineproduct record);

    int updateByPrimaryKey(DbOnlineproduct record);
}