package com.bean.dao;

import com.bean.model.DbAlibbporder;
import java.util.List;

public interface DbAlibbporderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_alibbporder
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_alibbporder
     *
     * @mbg.generated
     */
    int insert(DbAlibbporder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_alibbporder
     *
     * @mbg.generated
     */
    DbAlibbporder selectByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_alibbporder
     *
     * @mbg.generated
     */
    List<DbAlibbporder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_alibbporder
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbAlibbporder record);
}