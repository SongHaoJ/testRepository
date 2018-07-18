package com.bean.dao;

import com.bean.model.DbSellforshop;
import java.math.BigDecimal;

public interface DbSellforshopMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbSellforshop record);

    int insertSelective(DbSellforshop record);

    DbSellforshop selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbSellforshop record);

    int updateByPrimaryKeyWithBLOBs(DbSellforshop record);

    int updateByPrimaryKey(DbSellforshop record);
}