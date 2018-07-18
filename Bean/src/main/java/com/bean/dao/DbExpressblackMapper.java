package com.bean.dao;

import com.bean.model.DbExpressblack;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpressblackMapper {
    DbExpressblack selectByCriteria(DbExpressblack DbExpressblack);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpressblack DbExpressblack);

    int insertByCriteria(DbExpressblack DbExpressblack);

    int updateByCriteria(DbExpressblack DbExpressblack);

    DbExpressblack selectByPrimaryKey(BigDecimal sequenceid);

    List<DbExpressblack> selectAll();
}