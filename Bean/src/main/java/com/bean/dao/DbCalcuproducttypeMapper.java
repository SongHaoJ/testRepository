package com.bean.dao;

import com.bean.model.DbCalcuproducttype;
import java.util.List;

public interface DbCalcuproducttypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuproducttype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuproducttype
     *
     * @mbg.generated
     */
    int insert(DbCalcuproducttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuproducttype
     *
     * @mbg.generated
     */
    DbCalcuproducttype selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuproducttype
     *
     * @mbg.generated
     */
    List<DbCalcuproducttype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcuproducttype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCalcuproducttype record);
}