package com.bean.dao;

import com.bean.model.DbYwexpresstype;

public interface DbYwexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbYwexpresstype record);

    int insertSelective(DbYwexpresstype record);

    DbYwexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbYwexpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbYwexpresstype record);

    int updateByPrimaryKey(DbYwexpresstype record);
}