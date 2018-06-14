package com.bean.dao;

import com.bean.model.DbShopmessagereportforms;
import java.math.BigDecimal;

public interface DbShopmessagereportformsMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbShopmessagereportforms record);

    int insertSelective(DbShopmessagereportforms record);

    DbShopmessagereportforms selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbShopmessagereportforms record);

    int updateByPrimaryKeyWithBLOBs(DbShopmessagereportforms record);

    int updateByPrimaryKey(DbShopmessagereportforms record);
}