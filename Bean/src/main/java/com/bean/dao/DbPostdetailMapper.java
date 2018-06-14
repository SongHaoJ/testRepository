package com.bean.dao;

import com.bean.model.DbPostdetail;

public interface DbPostdetailMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbPostdetail record);

    int insertSelective(DbPostdetail record);

    DbPostdetail selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbPostdetail record);

    int updateByPrimaryKey(DbPostdetail record);
}