package com.bean.dao;

import com.bean.model.DbPurchaseflowLog;
import java.math.BigDecimal;

public interface DbPurchaseflowLogMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbPurchaseflowLog record);

    int insertSelective(DbPurchaseflowLog record);

    DbPurchaseflowLog selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbPurchaseflowLog record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaseflowLog record);

    int updateByPrimaryKey(DbPurchaseflowLog record);
}