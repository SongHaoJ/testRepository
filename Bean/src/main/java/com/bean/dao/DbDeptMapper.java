package com.bean.dao;

import com.bean.model.DbDept;

public interface DbDeptMapper {
    int insert(DbDept record);

    int insertSelective(DbDept record);
}