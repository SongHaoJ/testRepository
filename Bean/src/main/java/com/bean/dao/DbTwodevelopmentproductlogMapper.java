package com.bean.dao;

import com.bean.model.DbTwodevelopmentproductlog;

public interface DbTwodevelopmentproductlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTwodevelopmentproductlog record);

    int insertSelective(DbTwodevelopmentproductlog record);

    DbTwodevelopmentproductlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTwodevelopmentproductlog record);

    int updateByPrimaryKeyWithBLOBs(DbTwodevelopmentproductlog record);

    int updateByPrimaryKey(DbTwodevelopmentproductlog record);
}