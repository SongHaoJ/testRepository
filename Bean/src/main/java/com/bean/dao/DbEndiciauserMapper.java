package com.bean.dao;

import com.bean.model.DbEndiciauser;

public interface DbEndiciauserMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEndiciauser record);

    int insertSelective(DbEndiciauser record);

    DbEndiciauser selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEndiciauser record);

    int updateByPrimaryKeyWithBLOBs(DbEndiciauser record);

    int updateByPrimaryKey(DbEndiciauser record);
}