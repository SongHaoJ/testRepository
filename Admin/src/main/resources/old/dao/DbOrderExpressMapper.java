package com.bean.dao;

import com.bean.model.DbOrderExpress;

public interface DbOrderExpressMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbOrderExpress record);

    int insertSelective(DbOrderExpress record);

    DbOrderExpress selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbOrderExpress record);

    int updateByPrimaryKey(DbOrderExpress record);
}