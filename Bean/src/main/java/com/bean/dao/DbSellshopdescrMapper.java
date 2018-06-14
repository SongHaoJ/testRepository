package com.bean.dao;

import com.bean.model.DbSellshopdescr;
import java.math.BigDecimal;

public interface DbSellshopdescrMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbSellshopdescr record);

    int insertSelective(DbSellshopdescr record);

    DbSellshopdescr selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbSellshopdescr record);

    int updateByPrimaryKey(DbSellshopdescr record);
}