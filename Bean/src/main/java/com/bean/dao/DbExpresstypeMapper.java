package com.bean.dao;

import com.bean.model.DbExpresstype;

public interface DbExpresstypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpresstype record);

    int insertSelective(DbExpresstype record);

    DbExpresstype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbExpresstype record);

    int updateByPrimaryKey(DbExpresstype record);
}