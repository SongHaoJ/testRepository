package com.bean.dao;

import com.bean.model.DbSpbase;

public interface DbSpbaseMapper {
    int deleteByPrimaryKey(String spcode);

    int insert(DbSpbase record);

    int insertSelective(DbSpbase record);

    DbSpbase selectByPrimaryKey(String spcode);

    int updateByPrimaryKeySelective(DbSpbase record);

    int updateByPrimaryKeyWithBLOBs(DbSpbase record);

    int updateByPrimaryKey(DbSpbase record);
}