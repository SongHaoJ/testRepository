package com.bean.dao;

import com.bean.model.DbPurchaseflowdevelop;
import java.math.BigDecimal;

public interface DbPurchaseflowdevelopMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbPurchaseflowdevelop record);

    int insertSelective(DbPurchaseflowdevelop record);

    DbPurchaseflowdevelop selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbPurchaseflowdevelop record);

    int updateByPrimaryKeyWithBLOBs(DbPurchaseflowdevelop record);

    int updateByPrimaryKey(DbPurchaseflowdevelop record);
}