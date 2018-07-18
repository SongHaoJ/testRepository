package com.bean.dao;

import com.bean.model.DbFpxprintlabel;

public interface DbFpxprintlabelMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbFpxprintlabel record);

    int insertSelective(DbFpxprintlabel record);

    DbFpxprintlabel selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbFpxprintlabel record);

    int updateByPrimaryKeyWithBLOBs(DbFpxprintlabel record);

    int updateByPrimaryKey(DbFpxprintlabel record);
}