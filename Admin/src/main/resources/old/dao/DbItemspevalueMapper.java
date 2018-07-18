package com.bean.dao;

import com.bean.model.DbItemspevalue;

public interface DbItemspevalueMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbItemspevalue record);

    int insertSelective(DbItemspevalue record);

    DbItemspevalue selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbItemspevalue record);

    int updateByPrimaryKeyWithBLOBs(DbItemspevalue record);

    int updateByPrimaryKey(DbItemspevalue record);
}