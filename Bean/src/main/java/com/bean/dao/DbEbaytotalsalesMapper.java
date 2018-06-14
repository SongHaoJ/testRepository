package com.bean.dao;

import com.bean.model.DbEbaytotalsales;
import java.math.BigDecimal;

public interface DbEbaytotalsalesMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbaytotalsales record);

    int insertSelective(DbEbaytotalsales record);

    DbEbaytotalsales selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbaytotalsales record);

    int updateByPrimaryKey(DbEbaytotalsales record);
}