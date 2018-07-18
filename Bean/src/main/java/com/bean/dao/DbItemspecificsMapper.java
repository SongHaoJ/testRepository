package com.bean.dao;

import com.bean.model.DbItemspecifics;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbItemspecificsMapper {
    DbItemspecifics selectByCriteria(DbItemspecifics DbItemspecifics);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspecifics DbItemspecifics);

    int insertByCriteria(DbItemspecifics DbItemspecifics);

    int updateByCriteria(DbItemspecifics DbItemspecifics);

    DbItemspecifics selectByPrimaryKey(BigDecimal sid);

    List<DbItemspecifics> selectAll();
}