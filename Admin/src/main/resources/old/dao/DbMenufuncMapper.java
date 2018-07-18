package com.bean.dao;

import com.bean.model.DbMenufunc;

public interface DbMenufuncMapper {
    int deleteByPrimaryKey(String funid);

    int insert(DbMenufunc record);

    int insertSelective(DbMenufunc record);

    DbMenufunc selectByPrimaryKey(String funid);

    int updateByPrimaryKeySelective(DbMenufunc record);

    int updateByPrimaryKeyWithBLOBs(DbMenufunc record);

    int updateByPrimaryKey(DbMenufunc record);
}