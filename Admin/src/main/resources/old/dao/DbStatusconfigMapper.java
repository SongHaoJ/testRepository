package com.bean.dao;

import com.bean.model.DbStatusconfig;
import java.math.BigDecimal;

public interface DbStatusconfigMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbStatusconfig record);

    int insertSelective(DbStatusconfig record);

    DbStatusconfig selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbStatusconfig record);

    int updateByPrimaryKey(DbStatusconfig record);
}