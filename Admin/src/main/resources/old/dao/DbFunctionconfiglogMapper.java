package com.bean.dao;

import com.bean.model.DbFunctionconfiglog;

public interface DbFunctionconfiglogMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFunctionconfiglog record);

    int insertSelective(DbFunctionconfiglog record);

    DbFunctionconfiglog selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFunctionconfiglog record);

    int updateByPrimaryKeyWithBLOBs(DbFunctionconfiglog record);

    int updateByPrimaryKey(DbFunctionconfiglog record);
}