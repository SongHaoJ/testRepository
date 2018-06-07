package com.bean.dao;

import com.bean.model.DbExpressapi;
import java.util.List;

public interface DbExpressapiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressapi
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressapi
     *
     * @mbg.generated
     */
    int insert(DbExpressapi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressapi
     *
     * @mbg.generated
     */
    DbExpressapi selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressapi
     *
     * @mbg.generated
     */
    List<DbExpressapi> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expressapi
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbExpressapi record);
}