package com.bean.dao;

import com.bean.model.DbQtcountry;

public interface DbQtcountryMapper {
    int deleteByPrimaryKey(String code2);

    int insert(DbQtcountry record);

    int insertSelective(DbQtcountry record);

    DbQtcountry selectByPrimaryKey(String code2);

    int updateByPrimaryKeySelective(DbQtcountry record);

    int updateByPrimaryKey(DbQtcountry record);
}