package com.bean.dao;

import com.bean.model.DbPackaginglog;
import java.util.List;

public interface DbPackaginglogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaginglog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaginglog
     *
     * @mbg.generated
     */
    int insert(DbPackaginglog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaginglog
     *
     * @mbg.generated
     */
    DbPackaginglog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaginglog
     *
     * @mbg.generated
     */
    List<DbPackaginglog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaginglog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPackaginglog record);
}