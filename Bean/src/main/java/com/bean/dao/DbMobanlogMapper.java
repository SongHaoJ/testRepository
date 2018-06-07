package com.bean.dao;

import com.bean.model.DbMobanlog;
import java.util.List;

public interface DbMobanlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mobanlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mobanlog
     *
     * @mbg.generated
     */
    int insert(DbMobanlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mobanlog
     *
     * @mbg.generated
     */
    DbMobanlog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mobanlog
     *
     * @mbg.generated
     */
    List<DbMobanlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mobanlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbMobanlog record);
}