package com.bean.dao;

import com.bean.model.DbCoeexpresstype;
import java.util.List;

public interface DbCoeexpresstypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_coeexpresstype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_coeexpresstype
     *
     * @mbg.generated
     */
    int insert(DbCoeexpresstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_coeexpresstype
     *
     * @mbg.generated
     */
    DbCoeexpresstype selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_coeexpresstype
     *
     * @mbg.generated
     */
    List<DbCoeexpresstype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_coeexpresstype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCoeexpresstype record);
}