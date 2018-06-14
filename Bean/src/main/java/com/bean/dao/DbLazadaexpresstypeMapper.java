package com.bean.dao;

import com.bean.model.DbLazadaexpresstype;
import org.springframework.stereotype.Repository;

@Repository
public interface DbLazadaexpresstypeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbLazadaexpresstype record);

    int insertSelective(DbLazadaexpresstype record);

    DbLazadaexpresstype selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbLazadaexpresstype record);

    int updateByPrimaryKey(DbLazadaexpresstype record);
}