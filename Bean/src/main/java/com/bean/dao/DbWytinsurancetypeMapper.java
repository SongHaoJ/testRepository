package com.bean.dao;

import com.bean.model.DbWytinsurancetype;

public interface DbWytinsurancetypeMapper {
    int deleteByPrimaryKey(String insurancetype);

    int insert(DbWytinsurancetype record);

    int insertSelective(DbWytinsurancetype record);

    DbWytinsurancetype selectByPrimaryKey(String insurancetype);

    int updateByPrimaryKeySelective(DbWytinsurancetype record);

    int updateByPrimaryKey(DbWytinsurancetype record);
}