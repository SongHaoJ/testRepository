package com.bean.dao;

import com.bean.model.DbPurchaselog;

public interface DbPurchaselogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchaselog record);

    int insertSelective(DbPurchaselog record);

    DbPurchaselog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchaselog record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaselog record);

    int updateByPrimaryKey(DbPurchaselog record);
}