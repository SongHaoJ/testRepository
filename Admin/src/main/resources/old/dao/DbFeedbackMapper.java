package com.bean.dao;

import com.bean.model.DbFeedback;

public interface DbFeedbackMapper {
    int deleteByPrimaryKey(String feedbackid);

    int insert(DbFeedback record);

    int insertSelective(DbFeedback record);

    DbFeedback selectByPrimaryKey(String feedbackid);

    int updateByPrimaryKeySelective(DbFeedback record);

    int updateByPrimaryKeyWithBLOBs(DbFeedback record);

    int updateByPrimaryKey(DbFeedback record);
}