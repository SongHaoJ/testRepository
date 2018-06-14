package com.bean.dao;

import com.bean.model.DbProductdevelop;

public interface DbProductdevelopMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductdevelop record);

    int insertSelective(DbProductdevelop record);

    DbProductdevelop selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductdevelop record);

    int updateByPrimaryKeyWithBLOBs(DbProductdevelop record);

    int updateByPrimaryKey(DbProductdevelop record);
}