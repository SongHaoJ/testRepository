package com.bean.dao;

import com.bean.model.DbFpxprintlabel;
import java.util.List;

public interface DbFpxprintlabelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxprintlabel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxprintlabel
     *
     * @mbg.generated
     */
    int insert(DbFpxprintlabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxprintlabel
     *
     * @mbg.generated
     */
    DbFpxprintlabel selectByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxprintlabel
     *
     * @mbg.generated
     */
    List<DbFpxprintlabel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxprintlabel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbFpxprintlabel record);
}