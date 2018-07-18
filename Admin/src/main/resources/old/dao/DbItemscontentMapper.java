package com.bean.dao;

import com.bean.model.DbItemscontent;

public interface DbItemscontentMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbItemscontent record);

    int insertSelective(DbItemscontent record);

    DbItemscontent selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbItemscontent record);

    int updateByPrimaryKeyWithBLOBs(DbItemscontent record);

    int updateByPrimaryKey(DbItemscontent record);
}