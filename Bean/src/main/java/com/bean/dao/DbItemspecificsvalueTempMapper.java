package com.bean.dao;

import com.bean.model.DbItemspecificsvalueTemp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbItemspecificsvalueTempMapper {
    DbItemspecificsvalueTemp selectByCriteria(DbItemspecificsvalueTemp DbItemspecificsvalueTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspecificsvalueTemp DbItemspecificsvalueTemp);

    int insertByCriteria(DbItemspecificsvalueTemp DbItemspecificsvalueTemp);

    int updateByCriteria(DbItemspecificsvalueTemp DbItemspecificsvalueTemp);

    DbItemspecificsvalueTemp selectByPrimaryKey(BigDecimal sid);

    List<DbItemspecificsvalueTemp> selectAll();
}