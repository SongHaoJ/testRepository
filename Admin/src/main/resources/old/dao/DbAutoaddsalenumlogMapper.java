package com.bean.dao;

import com.bean.model.DbAutoaddsalenumlog;

public interface DbAutoaddsalenumlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAutoaddsalenumlog record);

    int insertSelective(DbAutoaddsalenumlog record);

    DbAutoaddsalenumlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAutoaddsalenumlog record);

    int updateByPrimaryKeyWithBLOBs(DbAutoaddsalenumlog record);

    int updateByPrimaryKey(DbAutoaddsalenumlog record);
}