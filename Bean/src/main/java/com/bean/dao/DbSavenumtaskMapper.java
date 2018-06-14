package com.bean.dao;

import com.bean.model.DbSavenumtask;
import java.math.BigDecimal;

public interface DbSavenumtaskMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DbSavenumtask record);

    int insertSelective(DbSavenumtask record);

    DbSavenumtask selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DbSavenumtask record);

    int updateByPrimaryKeyWithBLOBs(DbSavenumtask record);

    int updateByPrimaryKey(DbSavenumtask record);
}