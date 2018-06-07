package com.bean.dao;

import com.bean.model.DbGeneralTemp;
import java.util.List;

public interface DbGeneralTempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_general_temp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_general_temp
     *
     * @mbg.generated
     */
    int insert(DbGeneralTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_general_temp
     *
     * @mbg.generated
     */
    DbGeneralTemp selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_general_temp
     *
     * @mbg.generated
     */
    List<DbGeneralTemp> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_general_temp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbGeneralTemp record);
}