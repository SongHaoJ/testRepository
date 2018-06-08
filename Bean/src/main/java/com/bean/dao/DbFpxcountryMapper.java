package com.bean.dao;

import com.bean.model.DbFpxcountry;
import java.util.List;

public interface DbFpxcountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxcountry
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxcountry
     *
     * @mbg.generated
     */
    int insert(DbFpxcountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxcountry
     *
     * @mbg.generated
     */
    DbFpxcountry selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxcountry
     *
     * @mbg.generated
     */
    List<DbFpxcountry> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxcountry
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbFpxcountry record);
}