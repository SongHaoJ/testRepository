package com.bean.dao;

import com.bean.model.DbSpbase;
import java.util.List;

public interface DbSpbaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spbase
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String spcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spbase
     *
     * @mbg.generated
     */
    int insert(DbSpbase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spbase
     *
     * @mbg.generated
     */
    DbSpbase selectByPrimaryKey(String spcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spbase
     *
     * @mbg.generated
     */
    List<DbSpbase> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spbase
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSpbase record);
}