package com.bean.dao;

import com.bean.model.DbNotonlineproduct;

public interface DbNotonlineproductMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(DbNotonlineproduct record);

    int insertSelective(DbNotonlineproduct record);

    DbNotonlineproduct selectByPrimaryKey(String itemid);

    int updateByPrimaryKeySelective(DbNotonlineproduct record);

    int updateByPrimaryKey(DbNotonlineproduct record);
}