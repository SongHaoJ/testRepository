package com.bean.dao;

import com.bean.model.DbBiaoju;
import java.util.List;

public interface DbBiaojuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_biaoju
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_biaoju
     *
     * @mbg.generated
     */
    int insert(DbBiaoju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_biaoju
     *
     * @mbg.generated
     */
    DbBiaoju selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_biaoju
     *
     * @mbg.generated
     */
    List<DbBiaoju> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_biaoju
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbBiaoju record);
}