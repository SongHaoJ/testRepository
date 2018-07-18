package com.bean.dao;

import com.bean.model.DbProductinfo;

public interface DbProductinfoMapper {
    int deleteByPrimaryKey(String skuid);

    int insert(DbProductinfo record);

    int insertSelective(DbProductinfo record);

    DbProductinfo selectByPrimaryKey(String skuid);

    int updateByPrimaryKeySelective(DbProductinfo record);

    int updateByPrimaryKeyWithBLOBs(DbProductinfo record);

    int updateByPrimaryKey(DbProductinfo record);
}