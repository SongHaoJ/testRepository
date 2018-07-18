package com.bean.dao;

import com.bean.model.DbProductandsell;
import org.apache.ibatis.annotations.Param;

public interface DbProductandsellMapper {
    int deleteByPrimaryKey(@Param("sequenceid") String sequenceid, @Param("sku") String sku);

    int insert(DbProductandsell record);

    int insertSelective(DbProductandsell record);

    DbProductandsell selectByPrimaryKey(@Param("sequenceid") String sequenceid, @Param("sku") String sku);

    int updateByPrimaryKeySelective(DbProductandsell record);

    int updateByPrimaryKey(DbProductandsell record);
}