package com.bean.dao;

import com.bean.model.DbShopmessagereportforms;
import java.math.BigDecimal;
import java.util.List;

public interface DbShopmessagereportformsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagereportforms
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagereportforms
     *
     * @mbg.generated
     */
    int insert(DbShopmessagereportforms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagereportforms
     *
     * @mbg.generated
     */
    DbShopmessagereportforms selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagereportforms
     *
     * @mbg.generated
     */
    List<DbShopmessagereportforms> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagereportforms
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbShopmessagereportforms record);
}