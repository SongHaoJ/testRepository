package com.bean.dao;

import com.bean.model.DbReturnmanagermentLog;
import java.math.BigDecimal;

public interface DbReturnmanagermentLogMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbReturnmanagermentLog record);

    int insertSelective(DbReturnmanagermentLog record);

    DbReturnmanagermentLog selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbReturnmanagermentLog record);

    int updateByPrimaryKeyWithBLOBs(DbReturnmanagermentLog record);

    int updateByPrimaryKey(DbReturnmanagermentLog record);
}