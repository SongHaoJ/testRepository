package com.bean.dao;

import com.bean.model.DbPaymentset;

public interface DbPaymentsetMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPaymentset record);

    int insertSelective(DbPaymentset record);

    DbPaymentset selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPaymentset record);

    int updateByPrimaryKey(DbPaymentset record);
}