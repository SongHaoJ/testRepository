package com.bean.dao;

import com.bean.model.DbSpaypal;
import java.util.List;

public interface DbSpaypalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spaypal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spaypal
     *
     * @mbg.generated
     */
    int insert(DbSpaypal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spaypal
     *
     * @mbg.generated
     */
    DbSpaypal selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spaypal
     *
     * @mbg.generated
     */
    List<DbSpaypal> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_spaypal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSpaypal record);
}