package com.bean.dao;

import com.bean.model.DbSell;
import java.util.List;

public interface DbSellMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sell
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sell
     *
     * @mbg.generated
     */
    int insert(DbSell record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sell
     *
     * @mbg.generated
     */
    DbSell selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sell
     *
     * @mbg.generated
     */
    List<DbSell> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sell
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSell record);
}