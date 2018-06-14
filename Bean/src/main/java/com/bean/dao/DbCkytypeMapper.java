package com.bean.dao;

import com.bean.model.DbCkytype;

public interface DbCkytypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCkytype record);

    int insertSelective(DbCkytype record);

    DbCkytype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCkytype record);

    int updateByPrimaryKeyWithBLOBs(DbCkytype record);

    int updateByPrimaryKey(DbCkytype record);
}