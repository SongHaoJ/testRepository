package com.bean.dao;

import com.bean.model.DbPostitemTemp;

public interface DbPostitemTempMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbPostitemTemp record);

    int insertSelective(DbPostitemTemp record);

    DbPostitemTemp selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbPostitemTemp record);

    int updateByPrimaryKeyWithBLOBs(DbPostitemTemp record);

    int updateByPrimaryKey(DbPostitemTemp record);
}