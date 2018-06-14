package com.bean.dao;

import com.bean.model.DbCheckstocklog;

public interface DbCheckstocklogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCheckstocklog record);

    int insertSelective(DbCheckstocklog record);

    DbCheckstocklog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCheckstocklog record);

    int updateByPrimaryKeyWithBLOBs(DbCheckstocklog record);

    int updateByPrimaryKey(DbCheckstocklog record);
}