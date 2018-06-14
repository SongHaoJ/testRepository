package com.bean.dao;

import com.bean.model.DbEbaydsr;
import java.math.BigDecimal;

public interface DbEbaydsrMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbaydsr record);

    int insertSelective(DbEbaydsr record);

    DbEbaydsr selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbaydsr record);

    int updateByPrimaryKey(DbEbaydsr record);
}