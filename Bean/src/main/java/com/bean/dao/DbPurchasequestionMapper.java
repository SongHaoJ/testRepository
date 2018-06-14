package com.bean.dao;

import com.bean.model.DbPurchasequestion;

public interface DbPurchasequestionMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchasequestion record);

    int insertSelective(DbPurchasequestion record);

    DbPurchasequestion selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchasequestion record);

    int updateByPrimaryKeyWithBLOBs(DbPurchasequestion record);

    int updateByPrimaryKey(DbPurchasequestion record);
}