package com.bean.dao;

import com.bean.model.DbMultiWarehouse;

public interface DbMultiWarehouseMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMultiWarehouse record);

    int insertSelective(DbMultiWarehouse record);

    DbMultiWarehouse selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMultiWarehouse record);

    int updateByPrimaryKeyWithBLOBs(DbMultiWarehouse record);

    int updateByPrimaryKey(DbMultiWarehouse record);
}