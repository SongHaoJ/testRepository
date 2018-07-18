package com.bean.dao;

import com.bean.model.DbManystoragebin;

public interface DbManystoragebinMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbManystoragebin record);

    int insertSelective(DbManystoragebin record);

    DbManystoragebin selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbManystoragebin record);

    int updateByPrimaryKeyWithBLOBs(DbManystoragebin record);

    int updateByPrimaryKey(DbManystoragebin record);
}