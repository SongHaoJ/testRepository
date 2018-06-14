package com.bean.dao;

import com.bean.model.DbFinding;
import java.math.BigDecimal;

public interface DbFindingMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbFinding record);

    int insertSelective(DbFinding record);

    DbFinding selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbFinding record);

    int updateByPrimaryKey(DbFinding record);
}