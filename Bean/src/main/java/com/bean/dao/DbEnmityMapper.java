package com.bean.dao;

import com.bean.model.DbEnmity;
import java.math.BigDecimal;

public interface DbEnmityMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEnmity record);

    int insertSelective(DbEnmity record);

    DbEnmity selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEnmity record);

    int updateByPrimaryKeyWithBLOBs(DbEnmity record);

    int updateByPrimaryKey(DbEnmity record);
}