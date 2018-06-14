package com.bean.dao;

import com.bean.model.DbProductdevelopforson;
import java.math.BigDecimal;

public interface DbProductdevelopforsonMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductdevelopforson record);

    int insertSelective(DbProductdevelopforson record);

    DbProductdevelopforson selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductdevelopforson record);

    int updateByPrimaryKeyWithBLOBs(DbProductdevelopforson record);

    int updateByPrimaryKey(DbProductdevelopforson record);
}