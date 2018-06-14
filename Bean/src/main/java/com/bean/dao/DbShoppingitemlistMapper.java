package com.bean.dao;

import com.bean.model.DbShoppingitemlist;

public interface DbShoppingitemlistMapper {
    int deleteByPrimaryKey(String id);

    int insert(DbShoppingitemlist record);

    int insertSelective(DbShoppingitemlist record);

    DbShoppingitemlist selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DbShoppingitemlist record);

    int updateByPrimaryKey(DbShoppingitemlist record);
}