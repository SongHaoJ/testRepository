package com.bean.dao;

import com.bean.model.DbSavenumtask;
import java.math.BigDecimal;
import java.util.List;

public interface DbSavenumtaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    int insert(DbSavenumtask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    DbSavenumtask selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    List<DbSavenumtask> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_savenumtask
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSavenumtask record);
}