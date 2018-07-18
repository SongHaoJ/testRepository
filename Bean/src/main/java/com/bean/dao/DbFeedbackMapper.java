package com.bean.dao;

import com.bean.model.DbFeedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFeedbackMapper {
    DbFeedback selectByCriteria(DbFeedback DbFeedback);

    void deleteByPrimaryKey(String FEEDBACKID);

    void deleteByCriteria(DbFeedback DbFeedback);

    int insertByCriteria(DbFeedback DbFeedback);

    int updateByCriteria(DbFeedback DbFeedback);

    DbFeedback selectByPrimaryKey(String feedbackid);

    List<DbFeedback> selectAll();
}