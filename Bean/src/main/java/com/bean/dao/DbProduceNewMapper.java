package com.bean.dao;

import com.bean.model.DbProduceNew;

public interface DbProduceNewMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProduceNew record);

    int insertSelective(DbProduceNew record);

    DbProduceNew selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProduceNew record);

    int updateByPrimaryKey(DbProduceNew record);
}