package com.bean.dao;

import com.bean.model.DbFunctionlog;

public interface DbFunctionlogMapper {
    int insert(DbFunctionlog record);

    int insertSelective(DbFunctionlog record);
}