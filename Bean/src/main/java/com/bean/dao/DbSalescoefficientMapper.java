package com.bean.dao;

import com.bean.model.DbSalescoefficient;
import java.util.List;

public interface DbSalescoefficientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficient
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficient
     *
     * @mbg.generated
     */
    int insert(DbSalescoefficient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficient
     *
     * @mbg.generated
     */
    DbSalescoefficient selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficient
     *
     * @mbg.generated
     */
    List<DbSalescoefficient> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_salescoefficient
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSalescoefficient record);
}