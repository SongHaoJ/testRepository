package com.bean.dao;

import com.bean.model.DbProductalert;

public interface DbProductalertMapper {
    int deleteByPrimaryKey(String squenceid);

    int insert(DbProductalert record);

    int insertSelective(DbProductalert record);

    DbProductalert selectByPrimaryKey(String squenceid);

    int updateByPrimaryKeySelective(DbProductalert record);

    int updateByPrimaryKey(DbProductalert record);
}