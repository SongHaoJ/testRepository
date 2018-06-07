package com.bean.dao;

import com.bean.model.DbPurchase;
import java.util.List;

public interface DbPurchaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchase
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchase
     *
     * @mbg.generated
     */
    int insert(DbPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchase
     *
     * @mbg.generated
     */
    DbPurchase selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchase
     *
     * @mbg.generated
     */
    List<DbPurchase> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchase
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPurchase record);
}