package com.bean.dao;

import com.bean.model.DbEbayhighbbe;
import java.math.BigDecimal;
import java.util.List;

public interface DbEbayhighbbeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayhighbbe
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayhighbbe
     *
     * @mbg.generated
     */
    int insert(DbEbayhighbbe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayhighbbe
     *
     * @mbg.generated
     */
    DbEbayhighbbe selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayhighbbe
     *
     * @mbg.generated
     */
    List<DbEbayhighbbe> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebayhighbbe
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbEbayhighbbe record);
}