package com.bean.dao;

import com.bean.model.DbInstocklog;

public interface DbInstocklogMapper {
    int insert(DbInstocklog record);

    int insertSelective(DbInstocklog record);
}