package com.bean.dao;

import com.bean.model.DbTaskcustomertype;

public interface DbTaskcustomertypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTaskcustomertype record);

    int insertSelective(DbTaskcustomertype record);

    DbTaskcustomertype selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTaskcustomertype record);

    int updateByPrimaryKeyWithBLOBs(DbTaskcustomertype record);

    int updateByPrimaryKey(DbTaskcustomertype record);
}