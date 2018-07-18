package com.bean.dao;

import com.bean.model.DbItemresultTemp;
import java.math.BigDecimal;

public interface DbItemresultTempMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemresultTemp record);

    int insertSelective(DbItemresultTemp record);

    DbItemresultTemp selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemresultTemp record);

    int updateByPrimaryKeyWithBLOBs(DbItemresultTemp record);

    int updateByPrimaryKey(DbItemresultTemp record);
}