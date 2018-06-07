package com.bean.dao;

import com.bean.model.DbAywarehouse;
import java.util.List;

public interface DbAywarehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_aywarehouse
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_aywarehouse
     *
     * @mbg.generated
     */
    int insert(DbAywarehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_aywarehouse
     *
     * @mbg.generated
     */
    DbAywarehouse selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_aywarehouse
     *
     * @mbg.generated
     */
    List<DbAywarehouse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_aywarehouse
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbAywarehouse record);
}