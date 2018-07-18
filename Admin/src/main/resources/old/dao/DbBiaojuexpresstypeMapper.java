package com.bean.dao;

import com.bean.model.DbBiaojuexpresstype;

public interface DbBiaojuexpresstypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbBiaojuexpresstype record);

    int insertSelective(DbBiaojuexpresstype record);

    DbBiaojuexpresstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbBiaojuexpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbBiaojuexpresstype record);

    int updateByPrimaryKey(DbBiaojuexpresstype record);
}