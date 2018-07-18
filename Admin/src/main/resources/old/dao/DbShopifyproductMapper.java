package com.bean.dao;

import com.bean.model.DbShopifyproduct;

public interface DbShopifyproductMapper {
    int deleteByPrimaryKey(String variantid);

    int insert(DbShopifyproduct record);

    int insertSelective(DbShopifyproduct record);

    DbShopifyproduct selectByPrimaryKey(String variantid);

    int updateByPrimaryKeySelective(DbShopifyproduct record);

    int updateByPrimaryKey(DbShopifyproduct record);
}