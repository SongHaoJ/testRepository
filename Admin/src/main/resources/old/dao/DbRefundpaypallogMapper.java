package com.bean.dao;

import com.bean.model.DbRefundpaypallog;

public interface DbRefundpaypallogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbRefundpaypallog record);

    int insertSelective(DbRefundpaypallog record);

    DbRefundpaypallog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbRefundpaypallog record);

    int updateByPrimaryKeyWithBLOBs(DbRefundpaypallog record);

    int updateByPrimaryKey(DbRefundpaypallog record);
}