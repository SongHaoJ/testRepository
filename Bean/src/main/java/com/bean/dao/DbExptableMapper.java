package com.bean.dao;

import com.bean.model.DbExptable;

public interface DbExptableMapper {
    int insert(DbExptable record);

    int insertSelective(DbExptable record);
}