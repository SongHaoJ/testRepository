package com.bean.dao;

import com.bean.model.DbSfccounty;

public interface DbSfccountyMapper {
    int insert(DbSfccounty record);

    int insertSelective(DbSfccounty record);
}