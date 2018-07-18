package com.bean.dao;

import com.bean.model.DbAddaction;

public interface DbAddactionMapper {
    int insert(DbAddaction record);

    int insertSelective(DbAddaction record);
}