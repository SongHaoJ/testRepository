package com.bean.dao;

import com.bean.model.DbCalcuplatformlog;
import java.util.List;

public interface DbCalcuplatformlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuplatformlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuplatformlog
     *
     * @mbg.generated
     */
    int insert(DbCalcuplatformlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuplatformlog
     *
     * @mbg.generated
     */
    DbCalcuplatformlog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuplatformlog
     *
     * @mbg.generated
     */
    List<DbCalcuplatformlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuplatformlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCalcuplatformlog record);
}