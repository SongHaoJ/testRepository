package com.bean.dao;

import com.bean.model.DbExpresstypelog;
import java.util.List;

public interface DbExpresstypelogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expresstypelog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expresstypelog
     *
     * @mbg.generated
     */
    int insert(DbExpresstypelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expresstypelog
     *
     * @mbg.generated
     */
    DbExpresstypelog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expresstypelog
     *
     * @mbg.generated
     */
    List<DbExpresstypelog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_expresstypelog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbExpresstypelog record);
}