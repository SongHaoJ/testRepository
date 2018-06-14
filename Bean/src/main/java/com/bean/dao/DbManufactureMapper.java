package com.bean.dao;

import com.bean.model.DbManufacture;

public interface DbManufactureMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbManufacture record);

    int insertSelective(DbManufacture record);

    DbManufacture selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbManufacture record);

    int updateByPrimaryKeyWithBLOBs(DbManufacture record);

    int updateByPrimaryKey(DbManufacture record);
}