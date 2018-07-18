package com.bean.dao;

import com.bean.model.DbMailcontent;

public interface DbMailcontentMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMailcontent record);

    int insertSelective(DbMailcontent record);

    DbMailcontent selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMailcontent record);

    int updateByPrimaryKeyWithBLOBs(DbMailcontent record);

    int updateByPrimaryKey(DbMailcontent record);
}