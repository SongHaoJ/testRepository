package com.bean.dao;

import com.bean.model.DbEbayinquiry;
import java.util.List;

public interface DbEbayinquiryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayinquiry
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayinquiry
     *
     * @mbg.generated
     */
    int insert(DbEbayinquiry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayinquiry
     *
     * @mbg.generated
     */
    DbEbayinquiry selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayinquiry
     *
     * @mbg.generated
     */
    List<DbEbayinquiry> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayinquiry
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbEbayinquiry record);
}