package com.bean.dao;

import com.bean.model.DbAntistop;

public interface DbAntistopMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAntistop record);

    int insertSelective(DbAntistop record);

    DbAntistop selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAntistop record);

    int updateByPrimaryKeyWithBLOBs(DbAntistop record);

    int updateByPrimaryKey(DbAntistop record);
}