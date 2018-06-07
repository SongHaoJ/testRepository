package com.bean.dao;

import com.bean.model.DbPurchasehand;
import java.util.List;

public interface DbPurchasehandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasehand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasehand
     *
     * @mbg.generated
     */
    int insert(DbPurchasehand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasehand
     *
     * @mbg.generated
     */
    DbPurchasehand selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasehand
     *
     * @mbg.generated
     */
    List<DbPurchasehand> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasehand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPurchasehand record);
}