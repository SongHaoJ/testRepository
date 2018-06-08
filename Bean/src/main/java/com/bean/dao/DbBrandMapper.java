package com.bean.dao;

import com.bean.model.DbBrand;
import java.util.List;

public interface DbBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_brand
     *
     * @mbg.generated
     */
    int insert(DbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_brand
     *
     * @mbg.generated
     */
    DbBrand selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_brand
     *
     * @mbg.generated
     */
    List<DbBrand> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbBrand record);
}