package com.bean.dao;

import com.bean.model.DbEbaymessageconfig;
import java.util.List;

public interface DbEbaymessageconfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaymessageconfig
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaymessageconfig
     *
     * @mbg.generated
     */
    int insert(DbEbaymessageconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaymessageconfig
     *
     * @mbg.generated
     */
    DbEbaymessageconfig selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaymessageconfig
     *
     * @mbg.generated
     */
    List<DbEbaymessageconfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_ebaymessageconfig
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbEbaymessageconfig record);
}