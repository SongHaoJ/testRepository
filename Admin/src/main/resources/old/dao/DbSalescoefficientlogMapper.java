package com.bean.dao;

import com.bean.model.DbSalescoefficientlog;

public interface DbSalescoefficientlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSalescoefficientlog record);

    int insertSelective(DbSalescoefficientlog record);

    DbSalescoefficientlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSalescoefficientlog record);

    int updateByPrimaryKeyWithBLOBs(DbSalescoefficientlog record);

    int updateByPrimaryKey(DbSalescoefficientlog record);
}