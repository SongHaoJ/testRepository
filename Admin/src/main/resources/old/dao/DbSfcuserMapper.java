package com.bean.dao;

import com.bean.model.DbSfcuser;

public interface DbSfcuserMapper {
    int insert(DbSfcuser record);

    int insertSelective(DbSfcuser record);
}