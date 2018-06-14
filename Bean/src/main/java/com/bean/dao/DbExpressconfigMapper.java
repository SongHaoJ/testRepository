package com.bean.dao;

import com.bean.model.DbExpressconfig;

public interface DbExpressconfigMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DbExpressconfig record);

    int insertSelective(DbExpressconfig record);

    DbExpressconfig selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DbExpressconfig record);

    int updateByPrimaryKeyWithBLOBs(DbExpressconfig record);

    int updateByPrimaryKey(DbExpressconfig record);
}