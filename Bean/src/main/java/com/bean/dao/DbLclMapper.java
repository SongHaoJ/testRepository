package com.bean.dao;

import com.bean.model.DbLcl;
import java.math.BigDecimal;
import java.util.List;

public interface DbLclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcl
     *
     * @mbg.generated
     */
    int insert(DbLcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcl
     *
     * @mbg.generated
     */
    DbLcl selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcl
     *
     * @mbg.generated
     */
    List<DbLcl> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_lcl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbLcl record);
}