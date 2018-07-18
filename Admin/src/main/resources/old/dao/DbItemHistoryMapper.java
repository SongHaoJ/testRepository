package com.bean.dao;

import com.bean.model.DbItemHistory;
import java.math.BigDecimal;

public interface DbItemHistoryMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbItemHistory record);

    int insertSelective(DbItemHistory record);

    DbItemHistory selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbItemHistory record);

    int updateByPrimaryKey(DbItemHistory record);
}