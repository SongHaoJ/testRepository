package com.bean.dao;

import com.bean.model.DbPurchaseflowdevelopLog;
import java.math.BigDecimal;

public interface DbPurchaseflowdevelopLogMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbPurchaseflowdevelopLog record);

    int insertSelective(DbPurchaseflowdevelopLog record);

    DbPurchaseflowdevelopLog selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbPurchaseflowdevelopLog record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaseflowdevelopLog record);

    int updateByPrimaryKey(DbPurchaseflowdevelopLog record);
}