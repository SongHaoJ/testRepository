package com.bean.dao;

import com.bean.model.DbCustomertype;
import java.math.BigDecimal;
import java.util.List;

public interface DbCustomertypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customertype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customertype
     *
     * @mbg.generated
     */
    int insert(DbCustomertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customertype
     *
     * @mbg.generated
     */
    DbCustomertype selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customertype
     *
     * @mbg.generated
     */
    List<DbCustomertype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_customertype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCustomertype record);
}