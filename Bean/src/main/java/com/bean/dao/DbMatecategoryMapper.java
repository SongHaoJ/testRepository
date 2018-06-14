package com.bean.dao;

import com.bean.model.DbMatecategory;
import java.math.BigDecimal;

public interface DbMatecategoryMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbMatecategory record);

    int insertSelective(DbMatecategory record);

    DbMatecategory selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbMatecategory record);

    int updateByPrimaryKey(DbMatecategory record);
}