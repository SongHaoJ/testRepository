package com.bean.dao;

import com.bean.model.DbShoppingitem;

public interface DbShoppingitemMapper {
    int insert(DbShoppingitem record);

    int insertSelective(DbShoppingitem record);
}