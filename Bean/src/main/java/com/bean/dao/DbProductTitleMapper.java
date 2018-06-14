package com.bean.dao;

import com.bean.model.DbProductTitle;

public interface DbProductTitleMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductTitle record);

    int insertSelective(DbProductTitle record);

    DbProductTitle selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductTitle record);

    int updateByPrimaryKeyWithBLOBs(DbProductTitle record);

    int updateByPrimaryKey(DbProductTitle record);
}