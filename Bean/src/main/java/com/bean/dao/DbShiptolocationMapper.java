package com.bean.dao;

import com.bean.model.DbShiptolocation;

public interface DbShiptolocationMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbShiptolocation record);

    int insertSelective(DbShiptolocation record);

    DbShiptolocation selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbShiptolocation record);

    int updateByPrimaryKey(DbShiptolocation record);
}