package com.bean.dao;

import com.bean.model.DbWytexpress;

public interface DbWytexpressMapper {
    int deleteByPrimaryKey(String deliverywayid);

    int insert(DbWytexpress record);

    int insertSelective(DbWytexpress record);

    DbWytexpress selectByPrimaryKey(String deliverywayid);

    int updateByPrimaryKeySelective(DbWytexpress record);

    int updateByPrimaryKey(DbWytexpress record);
}