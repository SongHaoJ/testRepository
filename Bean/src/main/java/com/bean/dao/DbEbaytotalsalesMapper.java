package com.bean.dao;

import com.bean.model.DbEbaytotalsales;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbEbaytotalsalesMapper {
    DbEbaytotalsales selectByCriteria(DbEbaytotalsales DbEbaytotalsales);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaytotalsales DbEbaytotalsales);

    int insertByCriteria(DbEbaytotalsales DbEbaytotalsales);

    int updateByCriteria(DbEbaytotalsales DbEbaytotalsales);

    DbEbaytotalsales selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbaytotalsales> selectAll();
}