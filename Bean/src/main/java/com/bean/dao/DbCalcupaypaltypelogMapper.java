package com.bean.dao;

import com.bean.model.DbCalcupaypaltypelog;
import java.util.List;

public interface DbCalcupaypaltypelogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcupaypaltypelog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcupaypaltypelog
     *
     * @mbg.generated
     */
    int insert(DbCalcupaypaltypelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcupaypaltypelog
     *
     * @mbg.generated
     */
    DbCalcupaypaltypelog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcupaypaltypelog
     *
     * @mbg.generated
     */
    List<DbCalcupaypaltypelog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_calcupaypaltypelog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCalcupaypaltypelog record);
}