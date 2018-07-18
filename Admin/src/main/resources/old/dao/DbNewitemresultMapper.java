package com.bean.dao;

import com.bean.model.DbNewitemresult;

public interface DbNewitemresultMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbNewitemresult record);

    int insertSelective(DbNewitemresult record);

    DbNewitemresult selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbNewitemresult record);

    int updateByPrimaryKeyWithBLOBs(DbNewitemresult record);

    int updateByPrimaryKey(DbNewitemresult record);
}