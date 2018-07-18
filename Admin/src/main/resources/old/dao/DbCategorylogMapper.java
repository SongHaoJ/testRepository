package com.bean.dao;

import com.bean.model.DbCategorylog;

public interface DbCategorylogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCategorylog record);

    int insertSelective(DbCategorylog record);

    DbCategorylog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCategorylog record);

    int updateByPrimaryKeyWithBLOBs(DbCategorylog record);

    int updateByPrimaryKey(DbCategorylog record);
}