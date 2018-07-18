package com.bean.dao;

import com.bean.model.DbProductcontent;

public interface DbProductcontentMapper {
    int deleteByPrimaryKey(String productid);

    int insert(DbProductcontent record);

    int insertSelective(DbProductcontent record);

    DbProductcontent selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(DbProductcontent record);

    int updateByPrimaryKeyWithBLOBs(DbProductcontent record);
}