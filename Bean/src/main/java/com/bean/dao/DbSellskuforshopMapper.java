package com.bean.dao;

import com.bean.model.DbSellskuforshop;
import java.math.BigDecimal;

public interface DbSellskuforshopMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbSellskuforshop record);

    int insertSelective(DbSellskuforshop record);

    DbSellskuforshop selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbSellskuforshop record);

    int updateByPrimaryKeyWithBLOBs(DbSellskuforshop record);

    int updateByPrimaryKey(DbSellskuforshop record);
}