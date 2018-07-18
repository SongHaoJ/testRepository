package com.bean.dao;

import com.bean.model.DbManystoragebinlog;

public interface DbManystoragebinlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbManystoragebinlog record);

    int insertSelective(DbManystoragebinlog record);

    DbManystoragebinlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbManystoragebinlog record);

    int updateByPrimaryKeyWithBLOBs(DbManystoragebinlog record);

    int updateByPrimaryKey(DbManystoragebinlog record);
}