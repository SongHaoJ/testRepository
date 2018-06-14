package com.bean.dao;

import com.bean.model.DbCompetitorlist;

public interface DbCompetitorlistMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbCompetitorlist record);

    int insertSelective(DbCompetitorlist record);

    DbCompetitorlist selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbCompetitorlist record);

    int updateByPrimaryKey(DbCompetitorlist record);
}