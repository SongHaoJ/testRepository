package com.bean.dao;

import com.bean.model.DbDhluser;

public interface DbDhluserMapper {
    int insert(DbDhluser record);

    int insertSelective(DbDhluser record);
}