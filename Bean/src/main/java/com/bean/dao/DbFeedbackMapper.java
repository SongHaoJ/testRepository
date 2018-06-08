package com.bean.dao;

import com.bean.model.DbFeedback;
import java.util.List;

public interface DbFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String feedbackid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_feedback
     *
     * @mbg.generated
     */
    int insert(DbFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_feedback
     *
     * @mbg.generated
     */
    DbFeedback selectByPrimaryKey(String feedbackid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_feedback
     *
     * @mbg.generated
     */
    List<DbFeedback> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbFeedback record);
}