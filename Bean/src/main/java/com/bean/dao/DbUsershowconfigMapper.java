package com.bean.dao;

import com.bean.model.DbUsershowconfig;

public interface DbUsershowconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbUsershowconfig record);

    int insertSelective(DbUsershowconfig record);

    DbUsershowconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbUsershowconfig record);

    int updateByPrimaryKeyWithBLOBs(DbUsershowconfig record);

    int updateByPrimaryKey(DbUsershowconfig record);
}