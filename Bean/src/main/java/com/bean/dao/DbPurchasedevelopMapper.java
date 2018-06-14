package com.bean.dao;

import com.bean.model.DbPurchasedevelop;

public interface DbPurchasedevelopMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchasedevelop record);

    int insertSelective(DbPurchasedevelop record);

    DbPurchasedevelop selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchasedevelop record);

    int updateByPrimaryKeyWithBLOBs(DbPurchasedevelop record);

    int updateByPrimaryKey(DbPurchasedevelop record);
}