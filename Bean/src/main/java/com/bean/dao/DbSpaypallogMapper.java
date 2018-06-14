package com.bean.dao;

import com.bean.model.DbSpaypallog;

public interface DbSpaypallogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSpaypallog record);

    int insertSelective(DbSpaypallog record);

    DbSpaypallog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSpaypallog record);

    int updateByPrimaryKeyWithBLOBs(DbSpaypallog record);

    int updateByPrimaryKey(DbSpaypallog record);
}