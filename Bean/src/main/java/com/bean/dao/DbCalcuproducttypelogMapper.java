package com.bean.dao;

import com.bean.model.DbCalcuproducttypelog;

public interface DbCalcuproducttypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcuproducttypelog record);

    int insertSelective(DbCalcuproducttypelog record);

    DbCalcuproducttypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcuproducttypelog record);

    int updateByPrimaryKeyWithBLOBs(DbCalcuproducttypelog record);

    int updateByPrimaryKey(DbCalcuproducttypelog record);
}