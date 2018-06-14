package com.bean.dao;

import com.bean.model.DbProjectlog;

public interface DbProjectlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProjectlog record);

    int insertSelective(DbProjectlog record);

    DbProjectlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProjectlog record);

    int updateByPrimaryKeyWithBLOBs(DbProjectlog record);

    int updateByPrimaryKey(DbProjectlog record);
}