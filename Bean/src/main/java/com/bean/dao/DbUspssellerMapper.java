package com.bean.dao;

import com.bean.model.DbUspsseller;

public interface DbUspssellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbUspsseller record);

    int insertSelective(DbUspsseller record);

    DbUspsseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbUspsseller record);

    int updateByPrimaryKey(DbUspsseller record);
}