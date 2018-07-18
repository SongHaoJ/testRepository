package com.bean.dao;

import com.bean.model.DbCustomer;

public interface DbCustomerMapper {
    int deleteByPrimaryKey(String customerid);

    int insert(DbCustomer record);

    int insertSelective(DbCustomer record);

    DbCustomer selectByPrimaryKey(String customerid);

    int updateByPrimaryKeySelective(DbCustomer record);

    int updateByPrimaryKey(DbCustomer record);
}