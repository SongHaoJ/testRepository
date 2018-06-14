package com.bean.dao;

import com.bean.model.DbFpxoriginarea;

public interface DbFpxoriginareaMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFpxoriginarea record);

    int insertSelective(DbFpxoriginarea record);

    DbFpxoriginarea selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFpxoriginarea record);

    int updateByPrimaryKey(DbFpxoriginarea record);
}