package com.bean.dao;

import com.bean.model.DbBirdcountry;
import java.util.List;

public interface DbBirdcountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_birdcountry
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_birdcountry
     *
     * @mbg.generated
     */
    int insert(DbBirdcountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_birdcountry
     *
     * @mbg.generated
     */
    DbBirdcountry selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_birdcountry
     *
     * @mbg.generated
     */
    List<DbBirdcountry> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_birdcountry
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbBirdcountry record);
}