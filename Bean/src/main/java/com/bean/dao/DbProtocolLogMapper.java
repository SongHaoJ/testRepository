package com.bean.dao;

import com.bean.model.DbProtocolLog;

public interface DbProtocolLogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProtocolLog record);

    int insertSelective(DbProtocolLog record);

    DbProtocolLog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProtocolLog record);

    int updateByPrimaryKeyWithBLOBs(DbProtocolLog record);

    int updateByPrimaryKey(DbProtocolLog record);
}