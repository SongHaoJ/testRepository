package com.bean.dao;

import com.bean.model.DbEbaybbe;
import java.math.BigDecimal;
import java.util.List;

public interface DbEbaybbeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    int insert(DbEbaybbe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    DbEbaybbe selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    List<DbEbaybbe> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaybbe
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbEbaybbe record);
}