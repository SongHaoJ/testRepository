package com.bean.dao;

import com.bean.model.DbOrder;

public interface DbOrderMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbOrder record);

    int insertSelective(DbOrder record);

    DbOrder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbOrder record);

    int updateByPrimaryKeyWithBLOBs(DbOrder record);

    int updateByPrimaryKey(DbOrder record);
}