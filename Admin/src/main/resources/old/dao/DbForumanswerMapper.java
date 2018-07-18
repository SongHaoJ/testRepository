package com.bean.dao;

import com.bean.model.DbForumanswer;

public interface DbForumanswerMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbForumanswer record);

    int insertSelective(DbForumanswer record);

    DbForumanswer selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbForumanswer record);

    int updateByPrimaryKeyWithBLOBs(DbForumanswer record);

    int updateByPrimaryKey(DbForumanswer record);
}