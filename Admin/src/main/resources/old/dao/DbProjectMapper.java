package com.bean.dao;

import com.bean.model.DbProject;

public interface DbProjectMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbProject record);

    int insertSelective(DbProject record);

    DbProject selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbProject record);

    int updateByPrimaryKeyWithBLOBs(DbProject record);

    int updateByPrimaryKey(DbProject record);
}