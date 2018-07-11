package com.bean.dao;

import com.bean.model.DbSyslog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSyslogMapper {
    DbSyslog selectByCriteria(DbSyslog DbSyslog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSyslog DbSyslog);

    int insertByCriteria(DbSyslog DbSyslog);

    int updateByCriteria(DbSyslog DbSyslog);

    DbSyslog selectByPrimaryKey(String sequenceid);

    List<DbSyslog> selectAll();
}