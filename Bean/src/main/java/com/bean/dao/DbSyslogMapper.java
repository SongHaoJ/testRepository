package com.bean.dao;

import com.bean.model.DbSyslog;

public interface DbSyslogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSyslog record);

    int insertSelective(DbSyslog record);

    DbSyslog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSyslog record);

    int updateByPrimaryKeyWithBLOBs(DbSyslog record);

    int updateByPrimaryKey(DbSyslog record);
}