package com.bean.dao;

import com.bean.model.DbCalAmong;

public interface DbCalAmongMapper {
    int insert(DbCalAmong record);

    int insertSelective(DbCalAmong record);
}