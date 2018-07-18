package com.bean.dao;

import com.bean.model.DbCoeexpresstype;

public interface DbCoeexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCoeexpresstype record);

    int insertSelective(DbCoeexpresstype record);

    DbCoeexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCoeexpresstype record);

    int updateByPrimaryKey(DbCoeexpresstype record);
}