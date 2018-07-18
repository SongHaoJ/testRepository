package com.bean.dao;

import com.bean.model.DbDevelopstatus;

public interface DbDevelopstatusMapper {
    int insert(DbDevelopstatus record);

    int insertSelective(DbDevelopstatus record);
}