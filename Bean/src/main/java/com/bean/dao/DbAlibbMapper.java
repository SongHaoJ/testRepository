package com.bean.dao;

import com.bean.model.DbAlibb;

public interface DbAlibbMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbAlibb record);

    int insertSelective(DbAlibb record);

    DbAlibb selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbAlibb record);

    int updateByPrimaryKeyWithBLOBs(DbAlibb record);

    int updateByPrimaryKey(DbAlibb record);
}