package com.bean.dao;

import com.bean.model.DbItemspecificsvalue;
import java.math.BigDecimal;

public interface DbItemspecificsvalueMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemspecificsvalue record);

    int insertSelective(DbItemspecificsvalue record);

    DbItemspecificsvalue selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemspecificsvalue record);

    int updateByPrimaryKey(DbItemspecificsvalue record);
}