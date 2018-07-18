package com.bean.dao;

import com.bean.model.DbFpxexpresstype;

public interface DbFpxexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFpxexpresstype record);

    int insertSelective(DbFpxexpresstype record);

    DbFpxexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFpxexpresstype record);

    int updateByPrimaryKey(DbFpxexpresstype record);
}