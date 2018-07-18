package com.bean.dao;

import com.bean.model.DbTaskcatalog;

public interface DbTaskcatalogMapper {
    int insert(DbTaskcatalog record);

    int insertSelective(DbTaskcatalog record);
}