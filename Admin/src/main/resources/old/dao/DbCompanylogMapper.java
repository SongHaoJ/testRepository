package com.bean.dao;

import com.bean.model.DbCompanylog;

public interface DbCompanylogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCompanylog record);

    int insertSelective(DbCompanylog record);

    DbCompanylog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCompanylog record);

    int updateByPrimaryKeyWithBLOBs(DbCompanylog record);

    int updateByPrimaryKey(DbCompanylog record);
}