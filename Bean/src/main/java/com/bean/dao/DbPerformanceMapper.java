package com.bean.dao;

import com.bean.model.DbPerformance;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbPerformanceMapper {
    DbPerformance selectByCriteria(DbPerformance DbPerformance);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPerformance DbPerformance);

    int insertByCriteria(DbPerformance DbPerformance);

    int updateByCriteria(DbPerformance DbPerformance);

    DbPerformance selectByPrimaryKey(BigDecimal sequenceid);

    List<DbPerformance> selectAll();
}