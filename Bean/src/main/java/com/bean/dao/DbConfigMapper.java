package com.bean.dao;

import com.bean.model.DbConfig;
import java.util.List;

public interface DbConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_config
     *
     * @mbg.generated
     */
    int insert(DbConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_config
     *
     * @mbg.generated
     */
    DbConfig selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_config
     *
     * @mbg.generated
     */
    List<DbConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbConfig record);
}