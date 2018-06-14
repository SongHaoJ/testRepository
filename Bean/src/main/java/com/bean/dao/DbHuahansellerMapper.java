package com.bean.dao;

import com.bean.model.DbHuahanseller;

public interface DbHuahansellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbHuahanseller record);

    int insertSelective(DbHuahanseller record);

    DbHuahanseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbHuahanseller record);

    int updateByPrimaryKeyWithBLOBs(DbHuahanseller record);

    int updateByPrimaryKey(DbHuahanseller record);
}