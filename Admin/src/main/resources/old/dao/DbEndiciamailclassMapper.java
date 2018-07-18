package com.bean.dao;

import com.bean.model.DbEndiciamailclass;

public interface DbEndiciamailclassMapper {
    int deleteByPrimaryKey(String dbclass);

    int insert(DbEndiciamailclass record);

    int insertSelective(DbEndiciamailclass record);
}