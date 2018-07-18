package com.bean.dao;

import com.bean.model.DbSellResult;

public interface DbSellResultMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSellResult record);

    int insertSelective(DbSellResult record);

    DbSellResult selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSellResult record);

    int updateByPrimaryKey(DbSellResult record);
}