package com.bean.dao;

import com.bean.model.DbEbayidmanage;
import java.math.BigDecimal;

public interface DbEbayidmanageMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbayidmanage record);

    int insertSelective(DbEbayidmanage record);

    DbEbayidmanage selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbayidmanage record);

    int updateByPrimaryKey(DbEbayidmanage record);
}