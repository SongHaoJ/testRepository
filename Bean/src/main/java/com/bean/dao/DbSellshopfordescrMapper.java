package com.bean.dao;

import com.bean.model.DbSellshopfordescr;
import java.math.BigDecimal;

public interface DbSellshopfordescrMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbSellshopfordescr record);

    int insertSelective(DbSellshopfordescr record);

    DbSellshopfordescr selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbSellshopfordescr record);

    int updateByPrimaryKeyWithBLOBs(DbSellshopfordescr record);
}