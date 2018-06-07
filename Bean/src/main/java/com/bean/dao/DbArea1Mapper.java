package com.bean.dao;

import com.bean.model.DbArea1;
import java.util.List;

public interface DbArea1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area1
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String area);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area1
     *
     * @mbg.generated
     */
    int insert(DbArea1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area1
     *
     * @mbg.generated
     */
    DbArea1 selectByPrimaryKey(String area);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area1
     *
     * @mbg.generated
     */
    List<DbArea1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area1
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbArea1 record);
}