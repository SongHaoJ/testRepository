package com.bean.dao;

import com.bean.model.DbBiaojuextend;

public interface DbBiaojuextendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbBiaojuextend record);

    int insertSelective(DbBiaojuextend record);

    DbBiaojuextend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbBiaojuextend record);

    int updateByPrimaryKeyWithBLOBs(DbBiaojuextend record);

    int updateByPrimaryKey(DbBiaojuextend record);
}