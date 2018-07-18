package com.bean.dao;

import com.bean.model.DbItemspe;

public interface DbItemspeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbItemspe record);

    int insertSelective(DbItemspe record);

    DbItemspe selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbItemspe record);

    int updateByPrimaryKeyWithBLOBs(DbItemspe record);

    int updateByPrimaryKey(DbItemspe record);
}