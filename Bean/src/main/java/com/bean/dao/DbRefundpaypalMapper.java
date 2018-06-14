package com.bean.dao;

import com.bean.model.DbRefundpaypal;

public interface DbRefundpaypalMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbRefundpaypal record);

    int insertSelective(DbRefundpaypal record);

    DbRefundpaypal selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbRefundpaypal record);

    int updateByPrimaryKeyWithBLOBs(DbRefundpaypal record);

    int updateByPrimaryKey(DbRefundpaypal record);
}