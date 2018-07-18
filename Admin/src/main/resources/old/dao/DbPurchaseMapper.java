package com.bean.dao;

import com.bean.model.DbPurchase;

public interface DbPurchaseMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchase record);

    int insertSelective(DbPurchase record);

    DbPurchase selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchase record);

    int updateByPrimaryKeyWithBLOBs(DbPurchase record);

    int updateByPrimaryKey(DbPurchase record);
}