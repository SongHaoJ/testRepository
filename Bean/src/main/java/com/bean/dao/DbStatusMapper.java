package com.bean.dao;

import com.bean.model.DbStatus;
import java.math.BigDecimal;
import java.util.List;

public interface DbStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    int insert(DbStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    DbStatus selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    List<DbStatus> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_status
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbStatus record);
}