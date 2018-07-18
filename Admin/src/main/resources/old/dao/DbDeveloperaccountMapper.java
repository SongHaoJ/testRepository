package com.bean.dao;

import com.bean.model.DbDeveloperaccount;

public interface DbDeveloperaccountMapper {
    int insert(DbDeveloperaccount record);

    int insertSelective(DbDeveloperaccount record);
}