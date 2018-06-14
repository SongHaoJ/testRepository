package com.bean.dao;

import com.bean.model.DbCkyorder;

public interface DbCkyorderMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCkyorder record);

    int insertSelective(DbCkyorder record);

    DbCkyorder selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCkyorder record);

    int updateByPrimaryKey(DbCkyorder record);
}