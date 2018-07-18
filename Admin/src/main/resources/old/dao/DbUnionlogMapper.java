package com.bean.dao;

import com.bean.model.DbUnionlog;

public interface DbUnionlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbUnionlog record);

    int insertSelective(DbUnionlog record);

    DbUnionlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbUnionlog record);

    int updateByPrimaryKeyWithBLOBs(DbUnionlog record);

    int updateByPrimaryKey(DbUnionlog record);
}