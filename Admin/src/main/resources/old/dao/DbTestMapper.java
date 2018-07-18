package com.bean.dao;

import com.bean.model.DbTest;

public interface DbTestMapper {
    int insert(DbTest record);

    int insertSelective(DbTest record);
}