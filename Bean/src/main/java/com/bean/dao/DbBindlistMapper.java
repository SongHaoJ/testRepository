package com.bean.dao;

import com.bean.model.DbBindlist;

public interface DbBindlistMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBindlist record);

    int insertSelective(DbBindlist record);

    DbBindlist selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBindlist record);

}