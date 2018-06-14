package com.bean.dao;

import com.bean.model.DbCompanytype;

public interface DbCompanytypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbCompanytype record);

    int insertSelective(DbCompanytype record);

    DbCompanytype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbCompanytype record);

    int updateByPrimaryKey(DbCompanytype record);
}