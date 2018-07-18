package com.bean.dao;

import com.bean.model.DbGrouptype;

public interface DbGrouptypeMapper {
    int deleteByPrimaryKey(String groupid);

    int insert(DbGrouptype record);

    int insertSelective(DbGrouptype record);

    DbGrouptype selectByPrimaryKey(String groupid);

    int updateByPrimaryKeySelective(DbGrouptype record);

    int updateByPrimaryKeyWithBLOBs(DbGrouptype record);

    int updateByPrimaryKey(DbGrouptype record);
}