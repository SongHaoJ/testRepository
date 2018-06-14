package com.bean.dao;

import com.bean.model.DbEndicialabeltype;

public interface DbEndicialabeltypeMapper {
    int deleteByPrimaryKey(String type);

    int insert(DbEndicialabeltype record);

    int insertSelective(DbEndicialabeltype record);
}