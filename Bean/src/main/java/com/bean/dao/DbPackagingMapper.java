package com.bean.dao;

import com.bean.model.DbPackaging;
import java.util.List;

public interface DbPackagingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaging
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaging
     *
     * @mbg.generated
     */
    int insert(DbPackaging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaging
     *
     * @mbg.generated
     */
    DbPackaging selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaging
     *
     * @mbg.generated
     */
    List<DbPackaging> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_packaging
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbPackaging record);
}