package com.bean.dao;

import com.bean.model.DbTestpaypal;

public interface DbTestpaypalMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTestpaypal record);

    int insertSelective(DbTestpaypal record);

    DbTestpaypal selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTestpaypal record);

    int updateByPrimaryKey(DbTestpaypal record);
}