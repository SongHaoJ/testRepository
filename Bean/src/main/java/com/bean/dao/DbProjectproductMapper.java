package com.bean.dao;

import com.bean.model.DbProjectproduct;

public interface DbProjectproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbProjectproduct record);

    int insertSelective(DbProjectproduct record);

    DbProjectproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbProjectproduct record);

    int updateByPrimaryKeyWithBLOBs(DbProjectproduct record);

    int updateByPrimaryKey(DbProjectproduct record);
}