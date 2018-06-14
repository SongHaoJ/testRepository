package com.bean.dao;

import com.bean.model.DbOrdersearch;

public interface DbOrdersearchMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbOrdersearch record);

    int insertSelective(DbOrdersearch record);

    DbOrdersearch selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbOrdersearch record);

    int updateByPrimaryKeyWithBLOBs(DbOrdersearch record);

    int updateByPrimaryKey(DbOrdersearch record);
}