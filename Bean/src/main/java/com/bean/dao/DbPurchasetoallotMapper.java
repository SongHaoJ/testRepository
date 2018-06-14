package com.bean.dao;

import com.bean.model.DbPurchasetoallot;

public interface DbPurchasetoallotMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPurchasetoallot record);

    int insertSelective(DbPurchasetoallot record);

    DbPurchasetoallot selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPurchasetoallot record);

    int updateByPrimaryKeyWithBLOBs(DbPurchasetoallot record);

    int updateByPrimaryKey(DbPurchasetoallot record);
}