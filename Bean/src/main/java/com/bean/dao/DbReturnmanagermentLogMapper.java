package com.bean.dao;

import com.bean.model.DbReturnmanagermentLog;
import java.math.BigDecimal;
import java.util.List;

public interface DbReturnmanagermentLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    int insert(DbReturnmanagermentLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    DbReturnmanagermentLog selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    List<DbReturnmanagermentLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_returnmanagerment_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbReturnmanagermentLog record);
}