package com.bean.dao;

import com.bean.model.DbEncode;

public interface DbEncodeMapper {
    int deleteByPrimaryKey(String char1);

    int insert(DbEncode record);

    int insertSelective(DbEncode record);

    DbEncode selectByPrimaryKey(String char1);

    int updateByPrimaryKeySelective(DbEncode record);

    int updateByPrimaryKey(DbEncode record);
}