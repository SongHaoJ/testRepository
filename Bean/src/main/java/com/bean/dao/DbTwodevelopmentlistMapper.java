package com.bean.dao;

import com.bean.model.DbTwodevelopmentlist;

public interface DbTwodevelopmentlistMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTwodevelopmentlist record);

    int insertSelective(DbTwodevelopmentlist record);

    DbTwodevelopmentlist selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTwodevelopmentlist record);

    int updateByPrimaryKeyWithBLOBs(DbTwodevelopmentlist record);

    int updateByPrimaryKey(DbTwodevelopmentlist record);
}