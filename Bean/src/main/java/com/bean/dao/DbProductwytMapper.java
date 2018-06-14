package com.bean.dao;

import com.bean.model.DbProductwyt;

public interface DbProductwytMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbProductwyt record);

    int insertSelective(DbProductwyt record);

    DbProductwyt selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbProductwyt record);

    int updateByPrimaryKeyWithBLOBs(DbProductwyt record);

    int updateByPrimaryKey(DbProductwyt record);
}