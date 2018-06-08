package com.bean.dao;

import com.bean.model.DbSyslog;
import java.util.List;

public interface DbSyslogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_syslog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_syslog
     *
     * @mbg.generated
     */
    int insert(DbSyslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_syslog
     *
     * @mbg.generated
     */
    DbSyslog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_syslog
     *
     * @mbg.generated
     */
    List<DbSyslog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_syslog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSyslog record);
}