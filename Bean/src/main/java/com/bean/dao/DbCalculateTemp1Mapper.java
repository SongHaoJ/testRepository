package com.bean.dao;

import com.bean.model.DbCalculateTemp1;
import java.util.List;

public interface DbCalculateTemp1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    int insert(DbCalculateTemp1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    DbCalculateTemp1 selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    List<DbCalculateTemp1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calculate_temp1
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCalculateTemp1 record);
}