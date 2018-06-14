package com.bean.dao;

import com.bean.model.DbMysql;

public interface DbMysqlMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMysql record);

    int insertSelective(DbMysql record);

    DbMysql selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMysql record);

    int updateByPrimaryKey(DbMysql record);
}