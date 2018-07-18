package com.bean.dao;

import com.bean.model.DbItemresultHistory;
import java.math.BigDecimal;

public interface DbItemresultHistoryMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbItemresultHistory record);

    int insertSelective(DbItemresultHistory record);

    DbItemresultHistory selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbItemresultHistory record);

    int updateByPrimaryKeyWithBLOBs(DbItemresultHistory record);

    int updateByPrimaryKey(DbItemresultHistory record);
}