package com.bean.dao;

import com.bean.model.DbAmazonorder;

public interface DbAmazonorderMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbAmazonorder record);

    int insertSelective(DbAmazonorder record);

    DbAmazonorder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbAmazonorder record);

    int updateByPrimaryKeyWithBLOBs(DbAmazonorder record);

    int updateByPrimaryKey(DbAmazonorder record);
}