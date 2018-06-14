package com.bean.dao;

import com.bean.model.DbItemadded;

public interface DbItemaddedMapper {
    int deleteByPrimaryKey(String itemid);

    int insert(DbItemadded record);

    int insertSelective(DbItemadded record);
}