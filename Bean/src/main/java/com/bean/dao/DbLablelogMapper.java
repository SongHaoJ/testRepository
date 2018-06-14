package com.bean.dao;

import com.bean.model.DbLablelog;

public interface DbLablelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbLablelog record);

    int insertSelective(DbLablelog record);

    DbLablelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbLablelog record);

    int updateByPrimaryKeyWithBLOBs(DbLablelog record);

    int updateByPrimaryKey(DbLablelog record);
}