package com.bean.dao;

import com.bean.model.DbFaqquestion;

public interface DbFaqquestionMapper {
    int deleteByPrimaryKey(Integer sequenceid);

    int insert(DbFaqquestion record);

    int insertSelective(DbFaqquestion record);

    DbFaqquestion selectByPrimaryKey(Integer sequenceid);

    int updateByPrimaryKeySelective(DbFaqquestion record);

    int updateByPrimaryKeyWithBLOBs(DbFaqquestion record);

    int updateByPrimaryKey(DbFaqquestion record);
}