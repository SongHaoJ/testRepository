package com.bean.dao;

import com.bean.model.DbBindlist;
import java.util.List;

public interface DbBindlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bindlist
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bindlist
     *
     * @mbg.generated
     */
    int insert(DbBindlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bindlist
     *
     * @mbg.generated
     */
    DbBindlist selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bindlist
     *
     * @mbg.generated
     */
    List<DbBindlist> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_bindlist
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbBindlist record);
}