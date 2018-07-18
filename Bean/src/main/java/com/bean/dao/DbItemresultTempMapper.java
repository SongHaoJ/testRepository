package com.bean.dao;

import com.bean.model.DbItemresultTemp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbItemresultTempMapper {
    DbItemresultTemp selectByCriteria(DbItemresultTemp DbItemresultTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemresultTemp DbItemresultTemp);

    int insertByCriteria(DbItemresultTemp DbItemresultTemp);

    int updateByCriteria(DbItemresultTemp DbItemresultTemp);

    DbItemresultTemp selectByPrimaryKey(BigDecimal sid);

    List<DbItemresultTemp> selectAll();
}