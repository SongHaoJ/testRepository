package com.bean.dao;

import com.bean.model.DbTaskshop;

public interface DbTaskshopMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbTaskshop record);

    int insertSelective(DbTaskshop record);

    DbTaskshop selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbTaskshop record);

    int updateByPrimaryKeyWithBLOBs(DbTaskshop record);

    int updateByPrimaryKey(DbTaskshop record);
}