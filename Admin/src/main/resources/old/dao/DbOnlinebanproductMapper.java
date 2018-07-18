package com.bean.dao;

import com.bean.model.DbOnlinebanproduct;

public interface DbOnlinebanproductMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(DbOnlinebanproduct record);

    int insertSelective(DbOnlinebanproduct record);

    DbOnlinebanproduct selectByPrimaryKey(String itemid);

    int updateByPrimaryKeySelective(DbOnlinebanproduct record);

    int updateByPrimaryKey(DbOnlinebanproduct record);
}