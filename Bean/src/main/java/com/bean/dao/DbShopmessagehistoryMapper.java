package com.bean.dao;

import com.bean.model.DbShopmessagehistory;
import java.math.BigDecimal;
import java.util.List;

public interface DbShopmessagehistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagehistory
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagehistory
     *
     * @mbg.generated
     */
    int insert(DbShopmessagehistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagehistory
     *
     * @mbg.generated
     */
    DbShopmessagehistory selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagehistory
     *
     * @mbg.generated
     */
    List<DbShopmessagehistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shopmessagehistory
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbShopmessagehistory record);
}