package com.bean.dao;

import com.bean.model.DbArea;

public interface DbAreaMapper {
    int deleteByPrimaryKey(String area);

    int insert(DbArea record);

    int insertSelective(DbArea record);

    DbArea selectByPrimaryKey(String area);

    int updateByPrimaryKeySelective(DbArea record);

    int updateByPrimaryKey(DbArea record);
}