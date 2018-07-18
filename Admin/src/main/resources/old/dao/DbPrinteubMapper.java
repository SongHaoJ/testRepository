package com.bean.dao;

import com.bean.model.DbPrinteub;

public interface DbPrinteubMapper {
    int deleteByPrimaryKey(String state);

    int insert(DbPrinteub record);

    int insertSelective(DbPrinteub record);

    DbPrinteub selectByPrimaryKey(String state);

    int updateByPrimaryKeySelective(DbPrinteub record);

    int updateByPrimaryKey(DbPrinteub record);
}