package com.bean.dao;

import com.bean.model.DbSavenumtasklog;
import java.math.BigDecimal;

public interface DbSavenumtasklogMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbSavenumtasklog record);

    int insertSelective(DbSavenumtasklog record);

    DbSavenumtasklog selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbSavenumtasklog record);

    int updateByPrimaryKeyWithBLOBs(DbSavenumtasklog record);

    int updateByPrimaryKey(DbSavenumtasklog record);
}