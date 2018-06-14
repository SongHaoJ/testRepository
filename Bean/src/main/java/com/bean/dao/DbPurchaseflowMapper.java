package com.bean.dao;

import com.bean.model.DbPurchaseflow;
import java.math.BigDecimal;

public interface DbPurchaseflowMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbPurchaseflow record);

    int insertSelective(DbPurchaseflow record);

    DbPurchaseflow selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbPurchaseflow record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaseflow record);

    int updateByPrimaryKey(DbPurchaseflow record);
}