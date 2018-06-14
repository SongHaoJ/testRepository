package com.bean.dao;

import com.bean.model.DbEubdistrict;

public interface DbEubdistrictMapper {
    int deleteByPrimaryKey(String ditid);

    int insert(DbEubdistrict record);

    int insertSelective(DbEubdistrict record);

    DbEubdistrict selectByPrimaryKey(String ditid);

    int updateByPrimaryKeySelective(DbEubdistrict record);

    int updateByPrimaryKey(DbEubdistrict record);
}