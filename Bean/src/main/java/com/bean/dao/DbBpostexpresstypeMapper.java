package com.bean.dao;

import com.bean.model.DbBpostexpresstype;

public interface DbBpostexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBpostexpresstype record);

    int insertSelective(DbBpostexpresstype record);

    DbBpostexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBpostexpresstype record);

    int updateByPrimaryKey(DbBpostexpresstype record);
}