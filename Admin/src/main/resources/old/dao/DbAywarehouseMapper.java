package com.bean.dao;

import com.bean.model.DbAywarehouse;

public interface DbAywarehouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DbAywarehouse record);

    int insertSelective(DbAywarehouse record);

    DbAywarehouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DbAywarehouse record);

    int updateByPrimaryKey(DbAywarehouse record);
}