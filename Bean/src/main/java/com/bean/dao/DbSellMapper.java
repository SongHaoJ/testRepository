package com.bean.dao;

import com.bean.model.DbSell;

public interface DbSellMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbSell record);

    int insertSelective(DbSell record);

    DbSell selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbSell record);

    int updateByPrimaryKeyWithBLOBs(DbSell record);

    int updateByPrimaryKey(DbSell record);
}