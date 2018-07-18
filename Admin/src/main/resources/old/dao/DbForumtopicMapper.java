package com.bean.dao;

import com.bean.model.DbForumtopic;

public interface DbForumtopicMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbForumtopic record);

    int insertSelective(DbForumtopic record);

    DbForumtopic selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbForumtopic record);

    int updateByPrimaryKeyWithBLOBs(DbForumtopic record);

    int updateByPrimaryKey(DbForumtopic record);
}