package com.bean.dao;

import com.bean.model.DbCheckpurchasesmsprompt;

public interface DbCheckpurchasesmspromptMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCheckpurchasesmsprompt record);

    int insertSelective(DbCheckpurchasesmsprompt record);

    DbCheckpurchasesmsprompt selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCheckpurchasesmsprompt record);

    int updateByPrimaryKeyWithBLOBs(DbCheckpurchasesmsprompt record);

    int updateByPrimaryKey(DbCheckpurchasesmsprompt record);
}