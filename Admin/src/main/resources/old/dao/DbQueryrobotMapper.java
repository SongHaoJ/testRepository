package com.bean.dao;

import com.bean.model.DbQueryrobot;

public interface DbQueryrobotMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbQueryrobot record);

    int insertSelective(DbQueryrobot record);

    DbQueryrobot selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbQueryrobot record);

    int updateByPrimaryKeyWithBLOBs(DbQueryrobot record);

    int updateByPrimaryKey(DbQueryrobot record);
}