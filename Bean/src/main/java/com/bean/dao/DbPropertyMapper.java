package com.bean.dao;

import com.bean.model.DbProperty;

public interface DbPropertyMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbProperty record);

    int insertSelective(DbProperty record);

    DbProperty selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbProperty record);

    int updateByPrimaryKey(DbProperty record);
}