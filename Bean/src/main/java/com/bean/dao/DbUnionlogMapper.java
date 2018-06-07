package com.bean.dao;

import com.bean.model.DbUnionlog;
import java.util.List;

public interface DbUnionlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unionlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unionlog
     *
     * @mbg.generated
     */
    int insert(DbUnionlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unionlog
     *
     * @mbg.generated
     */
    DbUnionlog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unionlog
     *
     * @mbg.generated
     */
    List<DbUnionlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unionlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbUnionlog record);
}