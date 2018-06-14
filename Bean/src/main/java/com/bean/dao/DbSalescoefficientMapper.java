package com.bean.dao;

import com.bean.model.DbSalescoefficient;

public interface DbSalescoefficientMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSalescoefficient record);

    int insertSelective(DbSalescoefficient record);

    DbSalescoefficient selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSalescoefficient record);

    int updateByPrimaryKey(DbSalescoefficient record);
}