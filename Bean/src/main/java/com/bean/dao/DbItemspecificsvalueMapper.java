package com.bean.dao;

import com.bean.model.DbItemspecificsvalue;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbItemspecificsvalueMapper {
    DbItemspecificsvalue selectByCriteria(DbItemspecificsvalue DbItemspecificsvalue);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspecificsvalue DbItemspecificsvalue);

    int insertByCriteria(DbItemspecificsvalue DbItemspecificsvalue);

    int updateByCriteria(DbItemspecificsvalue DbItemspecificsvalue);

    DbItemspecificsvalue selectByPrimaryKey(BigDecimal sid);

    List<DbItemspecificsvalue> selectAll();
}