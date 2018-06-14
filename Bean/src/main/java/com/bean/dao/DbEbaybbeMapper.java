package com.bean.dao;

import com.bean.model.DbEbaybbe;
import java.math.BigDecimal;

public interface DbEbaybbeMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbaybbe record);

    int insertSelective(DbEbaybbe record);

    DbEbaybbe selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbaybbe record);

    int updateByPrimaryKey(DbEbaybbe record);
}