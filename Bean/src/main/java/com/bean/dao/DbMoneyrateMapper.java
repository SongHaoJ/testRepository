package com.bean.dao;

import com.bean.model.DbMoneyrate;

public interface DbMoneyrateMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMoneyrate record);

    int insertSelective(DbMoneyrate record);

    DbMoneyrate selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMoneyrate record);

    int updateByPrimaryKeyWithBLOBs(DbMoneyrate record);

    int updateByPrimaryKey(DbMoneyrate record);
}