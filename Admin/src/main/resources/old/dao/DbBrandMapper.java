package com.bean.dao;

import com.bean.model.DbBrand;

public interface DbBrandMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbBrand record);

    int insertSelective(DbBrand record);

    DbBrand selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbBrand record);

    int updateByPrimaryKeyWithBLOBs(DbBrand record);

    int updateByPrimaryKey(DbBrand record);
}