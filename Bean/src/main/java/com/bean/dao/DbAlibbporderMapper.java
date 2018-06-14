package com.bean.dao;

import com.bean.model.DbAlibbporder;

public interface DbAlibbporderMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbAlibbporder record);

    int insertSelective(DbAlibbporder record);

    DbAlibbporder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbAlibbporder record);

    int updateByPrimaryKeyWithBLOBs(DbAlibbporder record);

    int updateByPrimaryKey(DbAlibbporder record);
}