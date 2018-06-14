package com.bean.dao;

import com.bean.model.DbManufacturelog;

public interface DbManufacturelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbManufacturelog record);

    int insertSelective(DbManufacturelog record);

    DbManufacturelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbManufacturelog record);

    int updateByPrimaryKeyWithBLOBs(DbManufacturelog record);

    int updateByPrimaryKey(DbManufacturelog record);
}