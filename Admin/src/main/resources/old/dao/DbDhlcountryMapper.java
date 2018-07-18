package com.bean.dao;

import com.bean.model.DbDhlcountry;

public interface DbDhlcountryMapper {
    int insert(DbDhlcountry record);

    int insertSelective(DbDhlcountry record);
}