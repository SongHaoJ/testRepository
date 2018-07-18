package com.bean.dao;

import com.bean.model.DbItemadd;

public interface DbItemaddMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(DbItemadd record);

    int insertSelective(DbItemadd record);
}