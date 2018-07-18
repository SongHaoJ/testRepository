package com.bean.dao;

import com.bean.model.DbPurchasehand;

public interface DbPurchasehandMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchasehand record);

    int insertSelective(DbPurchasehand record);

    DbPurchasehand selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchasehand record);

    int updateByPrimaryKeyWithBLOBs(DbPurchasehand record);

    int updateByPrimaryKey(DbPurchasehand record);
}