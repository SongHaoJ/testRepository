package com.bean.dao;

import com.bean.model.DbTaskstatusconfig;

public interface DbTaskstatusconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTaskstatusconfig record);

    int insertSelective(DbTaskstatusconfig record);

    DbTaskstatusconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTaskstatusconfig record);

    int updateByPrimaryKey(DbTaskstatusconfig record);
}