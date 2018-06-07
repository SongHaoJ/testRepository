package com.bean.dao;

import com.bean.model.DbLcllog;
import java.math.BigDecimal;
import java.util.List;

public interface DbLcllogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcllog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcllog
     *
     * @mbg.generated
     */
    int insert(DbLcllog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcllog
     *
     * @mbg.generated
     */
    DbLcllog selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcllog
     *
     * @mbg.generated
     */
    List<DbLcllog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcllog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbLcllog record);
}