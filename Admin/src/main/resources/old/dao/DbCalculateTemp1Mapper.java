package com.bean.dao;

import com.bean.model.DbCalculateTemp1;

public interface DbCalculateTemp1Mapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCalculateTemp1 record);

    int insertSelective(DbCalculateTemp1 record);

    DbCalculateTemp1 selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCalculateTemp1 record);

    int updateByPrimaryKey(DbCalculateTemp1 record);
}