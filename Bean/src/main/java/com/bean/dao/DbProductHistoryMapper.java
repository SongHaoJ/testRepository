package com.bean.dao;

import com.bean.model.DbProductHistory;
import java.math.BigDecimal;

public interface DbProductHistoryMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbProductHistory record);

    int insertSelective(DbProductHistory record);

    DbProductHistory selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbProductHistory record);

    int updateByPrimaryKeyWithBLOBs(DbProductHistory record);

    int updateByPrimaryKey(DbProductHistory record);
}