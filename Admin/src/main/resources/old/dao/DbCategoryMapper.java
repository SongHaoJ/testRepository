package com.bean.dao;

import com.bean.model.DbCategory;

public interface DbCategoryMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCategory record);

    int insertSelective(DbCategory record);

    DbCategory selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCategory record);

    int updateByPrimaryKeyWithBLOBs(DbCategory record);

    int updateByPrimaryKey(DbCategory record);
}