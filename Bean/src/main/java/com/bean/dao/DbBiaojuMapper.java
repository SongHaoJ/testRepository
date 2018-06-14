package com.bean.dao;

import com.bean.model.DbBiaoju;

public interface DbBiaojuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbBiaoju record);

    int insertSelective(DbBiaoju record);

    DbBiaoju selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbBiaoju record);

    int updateByPrimaryKeyWithBLOBs(DbBiaoju record);

    int updateByPrimaryKey(DbBiaoju record);
}