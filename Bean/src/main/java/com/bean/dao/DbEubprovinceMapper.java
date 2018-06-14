package com.bean.dao;

import com.bean.model.DbEubprovince;

public interface DbEubprovinceMapper {
    int deleteByPrimaryKey(String provinceid);

    int insert(DbEubprovince record);

    int insertSelective(DbEubprovince record);

    DbEubprovince selectByPrimaryKey(String provinceid);

    int updateByPrimaryKeySelective(DbEubprovince record);

    int updateByPrimaryKey(DbEubprovince record);
}