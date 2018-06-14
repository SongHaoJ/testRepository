package com.bean.dao;

import com.bean.model.DbSellHistory;

public interface DbSellHistoryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbSellHistory record);

    int insertSelective(DbSellHistory record);

    DbSellHistory selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbSellHistory record);

    int updateByPrimaryKeyWithBLOBs(DbSellHistory record);

    int updateByPrimaryKey(DbSellHistory record);
}