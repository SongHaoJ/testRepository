package com.bean.dao;

import com.bean.model.DbPaymentset;
import java.util.List;

public interface DbPaymentsetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentset
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentset
     *
     * @mbg.generated
     */
    int insert(DbPaymentset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentset
     *
     * @mbg.generated
     */
    DbPaymentset selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentset
     *
     * @mbg.generated
     */
    List<DbPaymentset> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_paymentset
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPaymentset record);
}