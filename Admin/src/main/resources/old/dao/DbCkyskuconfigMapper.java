package com.bean.dao;

import com.bean.model.DbCkyskuconfig;

public interface DbCkyskuconfigMapper {
    int deleteByPrimaryKey(String productid);

    int insert(DbCkyskuconfig record);

    int insertSelective(DbCkyskuconfig record);

    DbCkyskuconfig selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(DbCkyskuconfig record);

    int updateByPrimaryKeyWithBLOBs(DbCkyskuconfig record);

    int updateByPrimaryKey(DbCkyskuconfig record);
}