package com.bean.dao;

import com.bean.model.DbFpxexpresstype;
import java.util.List;

public interface DbFpxexpresstypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxexpresstype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxexpresstype
     *
     * @mbg.generated
     */
    int insert(DbFpxexpresstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxexpresstype
     *
     * @mbg.generated
     */
    DbFpxexpresstype selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxexpresstype
     *
     * @mbg.generated
     */
    List<DbFpxexpresstype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_fpxexpresstype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbFpxexpresstype record);
}