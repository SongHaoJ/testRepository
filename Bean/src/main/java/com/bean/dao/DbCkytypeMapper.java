package com.bean.dao;

import com.bean.model.DbCkytype;
import java.util.List;

public interface DbCkytypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ckytype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ckytype
     *
     * @mbg.generated
     */
    int insert(DbCkytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ckytype
     *
     * @mbg.generated
     */
    DbCkytype selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ckytype
     *
     * @mbg.generated
     */
    List<DbCkytype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ckytype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCkytype record);
}