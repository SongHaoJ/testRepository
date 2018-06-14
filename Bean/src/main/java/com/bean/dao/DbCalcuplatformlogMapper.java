package com.bean.dao;

import com.bean.model.DbCalcuplatformlog;

public interface DbCalcuplatformlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCalcuplatformlog record);

    int insertSelective(DbCalcuplatformlog record);

    DbCalcuplatformlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCalcuplatformlog record);

    int updateByPrimaryKeyWithBLOBs(DbCalcuplatformlog record);

    int updateByPrimaryKey(DbCalcuplatformlog record);
}