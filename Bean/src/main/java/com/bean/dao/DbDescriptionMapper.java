package com.bean.dao;

import com.bean.model.DbDescription;
import java.math.BigDecimal;
import java.util.List;

public interface DbDescriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_description
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_description
     *
     * @mbg.generated
     */
    int insert(DbDescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_description
     *
     * @mbg.generated
     */
    DbDescription selectByPrimaryKey(BigDecimal itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_description
     *
     * @mbg.generated
     */
    List<DbDescription> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_description
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbDescription record);
}