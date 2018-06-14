package com.bean.dao;

import com.bean.model.DbAlinewproduct;

public interface DbAlinewproductMapper {
    int deleteByPrimaryKey(String aliitemid);

    int insert(DbAlinewproduct record);

    int insertSelective(DbAlinewproduct record);

    DbAlinewproduct selectByPrimaryKey(String aliitemid);

    int updateByPrimaryKeySelective(DbAlinewproduct record);

    int updateByPrimaryKey(DbAlinewproduct record);
}