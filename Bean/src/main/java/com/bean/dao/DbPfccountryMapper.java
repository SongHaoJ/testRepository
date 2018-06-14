package com.bean.dao;

import com.bean.model.DbPfccountry;

public interface DbPfccountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbPfccountry record);

    int insertSelective(DbPfccountry record);

    DbPfccountry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbPfccountry record);

    int updateByPrimaryKey(DbPfccountry record);
}