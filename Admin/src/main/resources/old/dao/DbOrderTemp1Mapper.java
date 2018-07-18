package com.bean.dao;

import com.bean.model.DbOrderTemp1;

public interface DbOrderTemp1Mapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbOrderTemp1 record);

    int insertSelective(DbOrderTemp1 record);

    DbOrderTemp1 selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbOrderTemp1 record);

    int updateByPrimaryKeyWithBLOBs(DbOrderTemp1 record);

    int updateByPrimaryKey(DbOrderTemp1 record);
}