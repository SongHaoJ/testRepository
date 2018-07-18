package com.bean.dao;

import com.bean.model.DbCountry;

public interface DbCountryMapper {
    int deleteByPrimaryKey(String countryid);

    int insert(DbCountry record);

    int insertSelective(DbCountry record);

    DbCountry selectByPrimaryKey(String countryid);

    int updateByPrimaryKeySelective(DbCountry record);

    int updateByPrimaryKey(DbCountry record);
}