package com.bean.dao;

import com.bean.model.DbExpresscountry;

public interface DbExpresscountryMapper {
    int insert(DbExpresscountry record);

    int insertSelective(DbExpresscountry record);
}