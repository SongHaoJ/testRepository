package com.bean.dao;

import com.bean.model.DbWytuser;
import java.util.List;

public interface DbWytuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytuser
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytuser
     *
     * @mbg.generated
     */
    int insert(DbWytuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytuser
     *
     * @mbg.generated
     */
    DbWytuser selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytuser
     *
     * @mbg.generated
     */
    List<DbWytuser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_wytuser
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbWytuser record);
}