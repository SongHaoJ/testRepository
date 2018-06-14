package com.bean.dao;

import com.bean.model.DbCaiwulog;

public interface DbCaiwulogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCaiwulog record);

    int insertSelective(DbCaiwulog record);

    DbCaiwulog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCaiwulog record);

    int updateByPrimaryKeyWithBLOBs(DbCaiwulog record);

    int updateByPrimaryKey(DbCaiwulog record);
}