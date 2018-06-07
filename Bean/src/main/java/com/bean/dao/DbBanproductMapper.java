package com.bean.dao;

import com.bean.model.DbBanproduct;
import java.util.List;

public interface DbBanproductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_banproduct
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_banproduct
     *
     * @mbg.generated
     */
    int insert(DbBanproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_banproduct
     *
     * @mbg.generated
     */
    DbBanproduct selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_banproduct
     *
     * @mbg.generated
     */
    List<DbBanproduct> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_banproduct
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbBanproduct record);
}