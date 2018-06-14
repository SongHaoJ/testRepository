package com.bean.dao;

import com.bean.model.DbAlisku;

public interface DbAliskuMapper {
    int deleteByPrimaryKey(String skuid);

    int insert(DbAlisku record);

    int insertSelective(DbAlisku record);

    DbAlisku selectByPrimaryKey(String skuid);

    int updateByPrimaryKeySelective(DbAlisku record);

    int updateByPrimaryKeyWithBLOBs(DbAlisku record);

    int updateByPrimaryKey(DbAlisku record);
}