package com.bean.dao;

import com.bean.model.DbShopmessagehistory;
import java.math.BigDecimal;

public interface DbShopmessagehistoryMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbShopmessagehistory record);

    int insertSelective(DbShopmessagehistory record);

    DbShopmessagehistory selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbShopmessagehistory record);

    int updateByPrimaryKeyWithBLOBs(DbShopmessagehistory record);

    int updateByPrimaryKey(DbShopmessagehistory record);
}