package com.bean.dao;

import com.bean.model.DbPerformance;
import java.math.BigDecimal;

public interface DbPerformanceMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbPerformance record);

    int insertSelective(DbPerformance record);

    DbPerformance selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbPerformance record);

    int updateByPrimaryKeyWithBLOBs(DbPerformance record);

    int updateByPrimaryKey(DbPerformance record);
}