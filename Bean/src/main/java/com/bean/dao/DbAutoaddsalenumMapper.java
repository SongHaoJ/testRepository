package com.bean.dao;

import com.bean.model.DbAutoaddsalenum;

public interface DbAutoaddsalenumMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAutoaddsalenum record);

    int insertSelective(DbAutoaddsalenum record);

    DbAutoaddsalenum selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAutoaddsalenum record);

    int updateByPrimaryKey(DbAutoaddsalenum record);
}