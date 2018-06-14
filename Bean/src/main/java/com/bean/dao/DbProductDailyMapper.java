package com.bean.dao;

import com.bean.model.DbProductDaily;

public interface DbProductDailyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductDaily record);

    int insertSelective(DbProductDaily record);

    DbProductDaily selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductDaily record);

    int updateByPrimaryKey(DbProductDaily record);
}