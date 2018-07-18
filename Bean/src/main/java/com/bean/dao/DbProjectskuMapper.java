package com.bean.dao;

import com.bean.model.DbProjectsku;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProjectskuMapper {
    DbProjectsku selectByCriteria(DbProjectsku DbProjectsku);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectsku DbProjectsku);

    int insertByCriteria(DbProjectsku DbProjectsku);

    int updateByCriteria(DbProjectsku DbProjectsku);

    DbProjectsku selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProjectsku> selectAll();
}