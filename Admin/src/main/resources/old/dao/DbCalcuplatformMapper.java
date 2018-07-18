package com.bean.dao;

import com.bean.model.DbCalcuplatform;

public interface DbCalcuplatformMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcuplatform record);

    int insertSelective(DbCalcuplatform record);

    DbCalcuplatform selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcuplatform record);

    int updateByPrimaryKeyWithBLOBs(DbCalcuplatform record);

    int updateByPrimaryKey(DbCalcuplatform record);
}