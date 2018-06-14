package com.bean.dao;

import com.bean.model.DbPurchaseTemp;

public interface DbPurchaseTempMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchaseTemp record);

    int insertSelective(DbPurchaseTemp record);

    DbPurchaseTemp selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchaseTemp record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaseTemp record);

    int updateByPrimaryKey(DbPurchaseTemp record);
}