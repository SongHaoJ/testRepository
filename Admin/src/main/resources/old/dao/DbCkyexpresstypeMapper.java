package com.bean.dao;

import com.bean.model.DbCkyexpresstype;

public interface DbCkyexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCkyexpresstype record);

    int insertSelective(DbCkyexpresstype record);

    DbCkyexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCkyexpresstype record);

    int updateByPrimaryKey(DbCkyexpresstype record);
}