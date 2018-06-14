package com.bean.dao;

import com.bean.model.DbAliaddress;

public interface DbAliaddressMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbAliaddress record);

    int insertSelective(DbAliaddress record);

    DbAliaddress selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbAliaddress record);

    int updateByPrimaryKey(DbAliaddress record);
}