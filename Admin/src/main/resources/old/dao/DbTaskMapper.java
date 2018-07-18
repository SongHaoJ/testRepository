package com.bean.dao;

import com.bean.model.DbTask;

public interface DbTaskMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTask record);

    int insertSelective(DbTask record);

    DbTask selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTask record);

    int updateByPrimaryKeyWithBLOBs(DbTask record);

    int updateByPrimaryKey(DbTask record);
}