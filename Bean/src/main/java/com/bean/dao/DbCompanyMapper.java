package com.bean.dao;

import com.bean.model.DbCompany;

public interface DbCompanyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCompany record);

    int insertSelective(DbCompany record);

    DbCompany selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCompany record);

    int updateByPrimaryKeyWithBLOBs(DbCompany record);

    int updateByPrimaryKey(DbCompany record);
}