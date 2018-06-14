package com.bean.dao;

import com.bean.model.DbTestexpress;

public interface DbTestexpressMapper {
    int insert(DbTestexpress record);

    int insertSelective(DbTestexpress record);
}