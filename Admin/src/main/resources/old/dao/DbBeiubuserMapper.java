package com.bean.dao;

import com.bean.model.DbBeiubuser;

public interface DbBeiubuserMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBeiubuser record);

    int insertSelective(DbBeiubuser record);

    DbBeiubuser selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBeiubuser record);

    int updateByPrimaryKey(DbBeiubuser record);
}