package com.bean.dao;

import com.bean.model.DbDepartmentapi;

public interface DbDepartmentapiMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbDepartmentapi record);

    int insertSelective(DbDepartmentapi record);

    DbDepartmentapi selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbDepartmentapi record);

    int updateByPrimaryKeyWithBLOBs(DbDepartmentapi record);

    int updateByPrimaryKey(DbDepartmentapi record);
}