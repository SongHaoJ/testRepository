package com.bean.dao;

import com.bean.model.DbSavenummonth;

public interface DbSavenummonthMapper {
    int deleteByPrimaryKey(String month);

    int insert(DbSavenummonth record);

    int insertSelective(DbSavenummonth record);

    DbSavenummonth selectByPrimaryKey(String month);

    int updateByPrimaryKeySelective(DbSavenummonth record);

    int updateByPrimaryKey(DbSavenummonth record);
}