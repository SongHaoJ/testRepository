package com.bean.dao;

import com.bean.model.DbExpressapick;
import java.math.BigDecimal;

public interface DbExpressapickMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbExpressapick record);

    int insertSelective(DbExpressapick record);

    DbExpressapick selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbExpressapick record);

    int updateByPrimaryKey(DbExpressapick record);
}