package com.bean.dao;

import com.bean.model.DbEbayexpresstype;
import java.math.BigDecimal;

public interface DbEbayexpresstypeMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbEbayexpresstype record);

    int insertSelective(DbEbayexpresstype record);

    DbEbayexpresstype selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbEbayexpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbEbayexpresstype record);

    int updateByPrimaryKey(DbEbayexpresstype record);
}