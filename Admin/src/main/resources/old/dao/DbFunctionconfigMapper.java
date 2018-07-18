package com.bean.dao;

import com.bean.model.DbFunctionconfig;
import java.math.BigDecimal;

public interface DbFunctionconfigMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbFunctionconfig record);

    int insertSelective(DbFunctionconfig record);

    DbFunctionconfig selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbFunctionconfig record);

    int updateByPrimaryKeyWithBLOBs(DbFunctionconfig record);

    int updateByPrimaryKey(DbFunctionconfig record);
}