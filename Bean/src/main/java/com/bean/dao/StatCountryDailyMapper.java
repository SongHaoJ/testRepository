package com.bean.dao;

import com.bean.model.StatCountryDaily;

public interface StatCountryDailyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(StatCountryDaily record);

    int insertSelective(StatCountryDaily record);

    StatCountryDaily selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(StatCountryDaily record);

    int updateByPrimaryKey(StatCountryDaily record);
}