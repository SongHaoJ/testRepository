package com.bean.dao;

import com.bean.model.DbShippinglocation;
import java.math.BigDecimal;
import java.util.List;

public interface DbShippinglocationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shippinglocation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shippinglocation
     *
     * @mbg.generated
     */
    int insert(DbShippinglocation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shippinglocation
     *
     * @mbg.generated
     */
    DbShippinglocation selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shippinglocation
     *
     * @mbg.generated
     */
    List<DbShippinglocation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shippinglocation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbShippinglocation record);
}