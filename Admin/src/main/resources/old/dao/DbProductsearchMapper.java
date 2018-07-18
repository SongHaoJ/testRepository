package com.bean.dao;

import com.bean.model.DbProductsearch;

public interface DbProductsearchMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductsearch record);

    int insertSelective(DbProductsearch record);

    DbProductsearch selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductsearch record);

    int updateByPrimaryKeyWithBLOBs(DbProductsearch record);

    int updateByPrimaryKey(DbProductsearch record);
}