package com.bean.dao;

import com.bean.model.DbPostitem;

public interface DbPostitemMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbPostitem record);

    int insertSelective(DbPostitem record);

    DbPostitem selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbPostitem record);

    int updateByPrimaryKeyWithBLOBs(DbPostitem record);

    int updateByPrimaryKey(DbPostitem record);
}