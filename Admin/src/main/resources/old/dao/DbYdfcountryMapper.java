package com.bean.dao;

import com.bean.model.DbYdfcountry;

public interface DbYdfcountryMapper {
    int insert(DbYdfcountry record);

    int insertSelective(DbYdfcountry record);
}