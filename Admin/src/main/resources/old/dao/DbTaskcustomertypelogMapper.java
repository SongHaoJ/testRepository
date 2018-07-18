package com.bean.dao;

import com.bean.model.DbTaskcustomertypelog;

public interface DbTaskcustomertypelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbTaskcustomertypelog record);

    int insertSelective(DbTaskcustomertypelog record);

    DbTaskcustomertypelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbTaskcustomertypelog record);

    int updateByPrimaryKeyWithBLOBs(DbTaskcustomertypelog record);

    int updateByPrimaryKey(DbTaskcustomertypelog record);
}