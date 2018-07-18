package com.bean.dao;

import com.bean.model.DbProductTitlelog;

public interface DbProductTitlelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductTitlelog record);

    int insertSelective(DbProductTitlelog record);

    DbProductTitlelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductTitlelog record);

    int updateByPrimaryKeyWithBLOBs(DbProductTitlelog record);

    int updateByPrimaryKey(DbProductTitlelog record);
}