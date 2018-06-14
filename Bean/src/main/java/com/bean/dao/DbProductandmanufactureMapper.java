package com.bean.dao;

import com.bean.model.DbProductandmanufacture;

public interface DbProductandmanufactureMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductandmanufacture record);

    int insertSelective(DbProductandmanufacture record);

    DbProductandmanufacture selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductandmanufacture record);

    int updateByPrimaryKeyWithBLOBs(DbProductandmanufacture record);

    int updateByPrimaryKey(DbProductandmanufacture record);
}