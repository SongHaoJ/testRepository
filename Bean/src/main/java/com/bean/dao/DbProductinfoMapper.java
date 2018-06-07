package com.bean.dao;

import com.bean.model.DbProductinfo;
import java.util.List;

public interface DbProductinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String skuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productinfo
     *
     * @mbg.generated
     */
    int insert(DbProductinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productinfo
     *
     * @mbg.generated
     */
    DbProductinfo selectByPrimaryKey(String skuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productinfo
     *
     * @mbg.generated
     */
    List<DbProductinfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbProductinfo record);
}