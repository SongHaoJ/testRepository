package com.bean.dao;

import com.bean.model.DbCalcuproducttype;

public interface DbCalcuproducttypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcuproducttype record);

    int insertSelective(DbCalcuproducttype record);

    DbCalcuproducttype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcuproducttype record);

    int updateByPrimaryKeyWithBLOBs(DbCalcuproducttype record);

    int updateByPrimaryKey(DbCalcuproducttype record);
}