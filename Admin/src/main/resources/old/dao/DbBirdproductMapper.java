package com.bean.dao;

import com.bean.model.DbBirdproduct;

public interface DbBirdproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBirdproduct record);

    int insertSelective(DbBirdproduct record);

    DbBirdproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBirdproduct record);

    int updateByPrimaryKeyWithBLOBs(DbBirdproduct record);

    int updateByPrimaryKey(DbBirdproduct record);
}