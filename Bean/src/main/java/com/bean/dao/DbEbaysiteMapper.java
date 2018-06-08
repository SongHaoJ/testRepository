package com.bean.dao;

import com.bean.model.DbEbaysite;
import java.util.List;

public interface DbEbaysiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaysite
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaysite
     *
     * @mbg.generated
     */
    int insert(DbEbaysite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaysite
     *
     * @mbg.generated
     */
    DbEbaysite selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaysite
     *
     * @mbg.generated
     */
    List<DbEbaysite> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaysite
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbEbaysite record);
}