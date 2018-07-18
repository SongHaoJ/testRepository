package com.bean.dao;

import com.bean.model.DbBirdexpresstype;

public interface DbBirdexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBirdexpresstype record);

    int insertSelective(DbBirdexpresstype record);

    DbBirdexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBirdexpresstype record);

    int updateByPrimaryKey(DbBirdexpresstype record);
}