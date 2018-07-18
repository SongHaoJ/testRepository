package com.bean.dao;

import com.bean.model.DbExpressapi;

public interface DbExpressapiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbExpressapi record);

    int insertSelective(DbExpressapi record);

    DbExpressapi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbExpressapi record);

    int updateByPrimaryKeyWithBLOBs(DbExpressapi record);

    int updateByPrimaryKey(DbExpressapi record);
}