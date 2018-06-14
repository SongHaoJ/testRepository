package com.bean.dao;

import com.bean.model.DbSalesdata;
import java.math.BigDecimal;

public interface DbSalesdataMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbSalesdata record);

    int insertSelective(DbSalesdata record);

    DbSalesdata selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbSalesdata record);

    int updateByPrimaryKeyWithBLOBs(DbSalesdata record);

    int updateByPrimaryKey(DbSalesdata record);
}