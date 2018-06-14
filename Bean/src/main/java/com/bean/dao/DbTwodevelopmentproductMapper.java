package com.bean.dao;

import com.bean.model.DbTwodevelopmentproduct;

public interface DbTwodevelopmentproductMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTwodevelopmentproduct record);

    int insertSelective(DbTwodevelopmentproduct record);

    DbTwodevelopmentproduct selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTwodevelopmentproduct record);

    int updateByPrimaryKeyWithBLOBs(DbTwodevelopmentproduct record);

    int updateByPrimaryKey(DbTwodevelopmentproduct record);
}