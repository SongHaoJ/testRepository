package com.bean.dao;

import com.bean.model.DbItemspecificsvalueTemp;
import java.math.BigDecimal;

public interface DbItemspecificsvalueTempMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemspecificsvalueTemp record);

    int insertSelective(DbItemspecificsvalueTemp record);

    DbItemspecificsvalueTemp selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemspecificsvalueTemp record);

    int updateByPrimaryKey(DbItemspecificsvalueTemp record);
}