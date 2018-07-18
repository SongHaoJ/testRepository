package com.bean.dao;

import com.bean.model.DbOrdertype;

public interface DbOrdertypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbOrdertype record);

    int insertSelective(DbOrdertype record);

    DbOrdertype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbOrdertype record);

    int updateByPrimaryKeyWithBLOBs(DbOrdertype record);

    int updateByPrimaryKey(DbOrdertype record);
}