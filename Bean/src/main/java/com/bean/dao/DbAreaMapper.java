package com.bean.dao;

import com.bean.model.DbArea;
import java.util.List;

public interface DbAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String area);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area
     *
     * @mbg.generated
     */
    int insert(DbArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area
     *
     * @mbg.generated
     */
    DbArea selectByPrimaryKey(String area);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area
     *
     * @mbg.generated
     */
    List<DbArea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_area
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbArea record);
}