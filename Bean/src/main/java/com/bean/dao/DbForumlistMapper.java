package com.bean.dao;

import com.bean.model.DbForumlist;

public interface DbForumlistMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbForumlist record);

    int insertSelective(DbForumlist record);

    DbForumlist selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbForumlist record);

    int updateByPrimaryKeyWithBLOBs(DbForumlist record);

    int updateByPrimaryKey(DbForumlist record);
}