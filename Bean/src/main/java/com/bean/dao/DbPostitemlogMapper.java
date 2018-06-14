package com.bean.dao;

import com.bean.model.DbPostitemlog;

public interface DbPostitemlogMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbPostitemlog record);

    int insertSelective(DbPostitemlog record);

    DbPostitemlog selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbPostitemlog record);

    int updateByPrimaryKeyWithBLOBs(DbPostitemlog record);

    int updateByPrimaryKey(DbPostitemlog record);
}