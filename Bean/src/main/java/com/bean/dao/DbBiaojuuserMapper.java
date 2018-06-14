package com.bean.dao;

import com.bean.model.DbBiaojuuser;

public interface DbBiaojuuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbBiaojuuser record);

    int insertSelective(DbBiaojuuser record);

    DbBiaojuuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbBiaojuuser record);

    int updateByPrimaryKey(DbBiaojuuser record);
}