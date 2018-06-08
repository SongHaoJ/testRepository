package com.bean.dao;

import com.bean.model.DbTask;
import java.util.List;

public interface DbTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_task
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_task
     *
     * @mbg.generated
     */
    int insert(DbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_task
     *
     * @mbg.generated
     */
    DbTask selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_task
     *
     * @mbg.generated
     */
    List<DbTask> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_task
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbTask record);
}