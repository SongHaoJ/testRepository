package com.bean.dao;

import com.bean.model.DbTaskkeyword;
import java.util.List;

public interface DbTaskkeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_taskkeyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_taskkeyword
     *
     * @mbg.generated
     */
    int insert(DbTaskkeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_taskkeyword
     *
     * @mbg.generated
     */
    DbTaskkeyword selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_taskkeyword
     *
     * @mbg.generated
     */
    List<DbTaskkeyword> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_taskkeyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbTaskkeyword record);
}