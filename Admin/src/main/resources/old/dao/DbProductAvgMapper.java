package com.bean.dao;

import com.bean.model.DbProductAvg;

public interface DbProductAvgMapper {
    int deleteByPrimaryKey(String sku);

    int insert(DbProductAvg record);

    int insertSelective(DbProductAvg record);

    DbProductAvg selectByPrimaryKey(String sku);

    int updateByPrimaryKeySelective(DbProductAvg record);

    int updateByPrimaryKey(DbProductAvg record);
}