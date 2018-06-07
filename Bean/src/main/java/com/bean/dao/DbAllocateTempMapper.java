package com.bean.dao;

import com.bean.model.DbAllocateTemp;
import java.util.List;

public interface DbAllocateTempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_allocate_temp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_allocate_temp
     *
     * @mbg.generated
     */
    int insert(DbAllocateTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_allocate_temp
     *
     * @mbg.generated
     */
    DbAllocateTemp selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_allocate_temp
     *
     * @mbg.generated
     */
    List<DbAllocateTemp> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_allocate_temp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbAllocateTemp record);
}