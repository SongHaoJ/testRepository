package com.bean.dao;

import com.bean.model.DbExpresstype;

import java.util.List;

public interface DbExpresstypeMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbExpresstype record);

    int insertSelective(DbExpresstype record);

    List<DbExpresstype> selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbExpresstype record);

}