package com.bean.dao;

import com.bean.model.DbMgtorderinfo;
import java.util.List;

public interface DbMgtorderinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mgtorderinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mgtorderinfo
     *
     * @mbg.generated
     */
    int insert(DbMgtorderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mgtorderinfo
     *
     * @mbg.generated
     */
    DbMgtorderinfo selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mgtorderinfo
     *
     * @mbg.generated
     */
    List<DbMgtorderinfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_mgtorderinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbMgtorderinfo record);
}