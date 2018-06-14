package com.bean.dao;

import com.bean.model.DbProductclass;

public interface DbProductclassMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductclass record);

    int insertSelective(DbProductclass record);

    DbProductclass selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductclass record);

    int updateByPrimaryKey(DbProductclass record);
}