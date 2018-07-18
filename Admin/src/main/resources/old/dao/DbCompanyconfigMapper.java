package com.bean.dao;

import com.bean.model.DbCompanyconfig;

public interface DbCompanyconfigMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCompanyconfig record);

    int insertSelective(DbCompanyconfig record);

    DbCompanyconfig selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCompanyconfig record);

    int updateByPrimaryKeyWithBLOBs(DbCompanyconfig record);

    int updateByPrimaryKey(DbCompanyconfig record);
}