package com.bean.dao;

import com.bean.model.DbOrderlog;

public interface DbOrderlogMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbOrderlog record);

    int insertSelective(DbOrderlog record);

    DbOrderlog selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbOrderlog record);

    int updateByPrimaryKeyWithBLOBs(DbOrderlog record);

    int updateByPrimaryKey(DbOrderlog record);
}