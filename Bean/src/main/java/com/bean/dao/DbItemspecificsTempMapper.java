package com.bean.dao;

import com.bean.model.DbItemspecificsTemp;
import java.math.BigDecimal;

public interface DbItemspecificsTempMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemspecificsTemp record);

    int insertSelective(DbItemspecificsTemp record);

    DbItemspecificsTemp selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemspecificsTemp record);

    int updateByPrimaryKey(DbItemspecificsTemp record);
}