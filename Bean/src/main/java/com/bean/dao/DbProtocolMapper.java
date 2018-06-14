package com.bean.dao;

import com.bean.model.DbProtocol;

public interface DbProtocolMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProtocol record);

    int insertSelective(DbProtocol record);

    DbProtocol selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProtocol record);

    int updateByPrimaryKeyWithBLOBs(DbProtocol record);

    int updateByPrimaryKey(DbProtocol record);
}