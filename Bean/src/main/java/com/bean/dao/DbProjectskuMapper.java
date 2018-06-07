package com.bean.dao;

import com.bean.model.DbProjectsku;
import java.math.BigDecimal;
import java.util.List;

public interface DbProjectskuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectsku
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectsku
     *
     * @mbg.generated
     */
    int insert(DbProjectsku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectsku
     *
     * @mbg.generated
     */
    DbProjectsku selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectsku
     *
     * @mbg.generated
     */
    List<DbProjectsku> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_projectsku
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbProjectsku record);
}