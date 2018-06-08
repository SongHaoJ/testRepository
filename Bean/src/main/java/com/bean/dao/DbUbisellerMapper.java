package com.bean.dao;

import com.bean.model.DbUbiseller;
import java.util.List;

public interface DbUbisellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ubiseller
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ubiseller
     *
     * @mbg.generated
     */
    int insert(DbUbiseller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ubiseller
     *
     * @mbg.generated
     */
    DbUbiseller selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ubiseller
     *
     * @mbg.generated
     */
    List<DbUbiseller> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ubiseller
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbUbiseller record);
}