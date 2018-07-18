package com.bean.dao;

import com.bean.model.DbPricelist;

public interface DbPricelistMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbPricelist record);

    int insertSelective(DbPricelist record);

    DbPricelist selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbPricelist record);

    int updateByPrimaryKey(DbPricelist record);
}