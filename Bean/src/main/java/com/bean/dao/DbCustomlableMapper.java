package com.bean.dao;

import com.bean.model.DbCustomlable;
import java.util.List;

public interface DbCustomlableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customlable
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customlable
     *
     * @mbg.generated
     */
    int insert(DbCustomlable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customlable
     *
     * @mbg.generated
     */
    DbCustomlable selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customlable
     *
     * @mbg.generated
     */
    List<DbCustomlable> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customlable
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCustomlable record);
}