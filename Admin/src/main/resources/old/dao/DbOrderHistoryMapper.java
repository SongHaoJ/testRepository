package com.bean.dao;

import com.bean.model.DbOrderHistory;

public interface DbOrderHistoryMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbOrderHistory record);

    int insertSelective(DbOrderHistory record);

    DbOrderHistory selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbOrderHistory record);

    int updateByPrimaryKeyWithBLOBs(DbOrderHistory record);

    int updateByPrimaryKey(DbOrderHistory record);
}