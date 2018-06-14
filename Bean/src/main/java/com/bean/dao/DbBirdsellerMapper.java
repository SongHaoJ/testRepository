package com.bean.dao;

import com.bean.model.DbBirdseller;

public interface DbBirdsellerMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBirdseller record);

    int insertSelective(DbBirdseller record);

    DbBirdseller selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBirdseller record);

    int updateByPrimaryKey(DbBirdseller record);
}