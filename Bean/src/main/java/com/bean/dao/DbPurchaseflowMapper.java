package com.bean.dao;

import com.bean.model.DbPurchaseflow;
import java.math.BigDecimal;
import java.util.List;

public interface DbPurchaseflowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow
     *
     * @mbg.generated
     */
    int insert(DbPurchaseflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow
     *
     * @mbg.generated
     */
    DbPurchaseflow selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow
     *
     * @mbg.generated
     */
    List<DbPurchaseflow> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchaseflow
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPurchaseflow record);
}