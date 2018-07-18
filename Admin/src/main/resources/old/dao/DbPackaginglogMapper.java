package com.bean.dao;

import com.bean.model.DbPackaginglog;

public interface DbPackaginglogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPackaginglog record);

    int insertSelective(DbPackaginglog record);

    DbPackaginglog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPackaginglog record);

    int updateByPrimaryKeyWithBLOBs(DbPackaginglog record);

    int updateByPrimaryKey(DbPackaginglog record);
}