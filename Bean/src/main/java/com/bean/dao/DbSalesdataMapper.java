package com.bean.dao;

import com.bean.model.DbSalesdata;
import java.math.BigDecimal;
import java.util.List;

public interface DbSalesdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salesdata
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salesdata
     *
     * @mbg.generated
     */
    int insert(DbSalesdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salesdata
     *
     * @mbg.generated
     */
    DbSalesdata selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salesdata
     *
     * @mbg.generated
     */
    List<DbSalesdata> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salesdata
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSalesdata record);
}