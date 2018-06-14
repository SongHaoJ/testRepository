package com.bean.dao;

import com.bean.model.DbEdisaddress;

public interface DbEdisaddressMapper {
    int deleteByPrimaryKey(String addressid);

    int insert(DbEdisaddress record);

    int insertSelective(DbEdisaddress record);

    DbEdisaddress selectByPrimaryKey(String addressid);

    int updateByPrimaryKeySelective(DbEdisaddress record);

    int updateByPrimaryKey(DbEdisaddress record);
}