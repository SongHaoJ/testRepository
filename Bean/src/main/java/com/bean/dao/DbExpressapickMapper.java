package com.bean.dao;

import com.bean.model.DbExpressapick;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpressapickMapper {
    DbExpressapick selectByCriteria(DbExpressapick DbExpressapick);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExpressapick DbExpressapick);

    int insertByCriteria(DbExpressapick DbExpressapick);

    int updateByCriteria(DbExpressapick DbExpressapick);

    DbExpressapick selectByPrimaryKey(BigDecimal id);

    List<DbExpressapick> selectAll();
}