package com.bean.dao;

import com.bean.model.DbShiptolocation;
import java.util.List;

public interface DbShiptolocationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    int insert(DbShiptolocation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    DbShiptolocation selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    List<DbShiptolocation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shiptolocation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbShiptolocation record);
}