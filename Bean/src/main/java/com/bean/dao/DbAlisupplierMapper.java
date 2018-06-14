package com.bean.dao;

import com.bean.model.DbAlisupplier;

public interface DbAlisupplierMapper {
    int deleteByPrimaryKey(String userid);

    int insert(DbAlisupplier record);

    int insertSelective(DbAlisupplier record);

    DbAlisupplier selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(DbAlisupplier record);

    int updateByPrimaryKeyWithBLOBs(DbAlisupplier record);

    int updateByPrimaryKey(DbAlisupplier record);
}