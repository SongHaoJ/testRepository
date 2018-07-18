package com.bean.dao;

import com.bean.model.DbMgtorderinfo;

public interface DbMgtorderinfoMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMgtorderinfo record);

    int insertSelective(DbMgtorderinfo record);

    DbMgtorderinfo selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMgtorderinfo record);

    int updateByPrimaryKeyWithBLOBs(DbMgtorderinfo record);

    int updateByPrimaryKey(DbMgtorderinfo record);
}