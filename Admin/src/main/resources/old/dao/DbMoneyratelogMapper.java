package com.bean.dao;

import com.bean.model.DbMoneyratelog;

public interface DbMoneyratelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMoneyratelog record);

    int insertSelective(DbMoneyratelog record);

    DbMoneyratelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMoneyratelog record);

    int updateByPrimaryKeyWithBLOBs(DbMoneyratelog record);

    int updateByPrimaryKey(DbMoneyratelog record);
}