package com.bean.dao;

import com.bean.model.DbExpressiddata;
import java.util.List;

public interface DbExpressiddataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressiddata
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressiddata
     *
     * @mbg.generated
     */
    int insert(DbExpressiddata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressiddata
     *
     * @mbg.generated
     */
    DbExpressiddata selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressiddata
     *
     * @mbg.generated
     */
    List<DbExpressiddata> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressiddata
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbExpressiddata record);
}