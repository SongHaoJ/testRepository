package com.bean.dao;

import com.bean.model.DbCalculatconfig;
import java.math.BigDecimal;

public interface DbCalculatconfigMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbCalculatconfig record);

    int insertSelective(DbCalculatconfig record);

    DbCalculatconfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbCalculatconfig record);

    int updateByPrimaryKey(DbCalculatconfig record);
}