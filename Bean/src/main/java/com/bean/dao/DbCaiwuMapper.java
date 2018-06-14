package com.bean.dao;

import com.bean.model.DbCaiwu;

public interface DbCaiwuMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCaiwu record);

    int insertSelective(DbCaiwu record);

    DbCaiwu selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCaiwu record);

    int updateByPrimaryKeyWithBLOBs(DbCaiwu record);

    int updateByPrimaryKey(DbCaiwu record);
}