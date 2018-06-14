package com.bean.dao;

import com.bean.model.DbOrderHistoryLog;

public interface DbOrderHistoryLogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbOrderHistoryLog record);

    int insertSelective(DbOrderHistoryLog record);

    DbOrderHistoryLog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbOrderHistoryLog record);

    int updateByPrimaryKeyWithBLOBs(DbOrderHistoryLog record);

    int updateByPrimaryKey(DbOrderHistoryLog record);
}