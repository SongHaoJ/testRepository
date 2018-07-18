package com.bean.dao;

import com.bean.model.DbTasklog;

public interface DbTasklogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTasklog record);

    int insertSelective(DbTasklog record);

    DbTasklog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTasklog record);

    int updateByPrimaryKeyWithBLOBs(DbTasklog record);

    int updateByPrimaryKey(DbTasklog record);
}