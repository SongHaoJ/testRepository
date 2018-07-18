package com.bean.dao;

import com.bean.model.DbConfig;

public interface DbConfigMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbConfig record);

    int insertSelective(DbConfig record);

    DbConfig selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbConfig record);

    int updateByPrimaryKeyWithBLOBs(DbConfig record);

    int updateByPrimaryKey(DbConfig record);
}