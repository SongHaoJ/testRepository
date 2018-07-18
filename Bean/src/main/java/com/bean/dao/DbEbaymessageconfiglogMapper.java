package com.bean.dao;

import com.bean.model.DbEbaymessageconfiglog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageconfiglogMapper {
    DbEbaymessageconfiglog selectByCriteria(DbEbaymessageconfiglog DbEbaymessageconfiglog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessageconfiglog DbEbaymessageconfiglog);

    int insertByCriteria(DbEbaymessageconfiglog DbEbaymessageconfiglog);

    int updateByCriteria(DbEbaymessageconfiglog DbEbaymessageconfiglog);

    DbEbaymessageconfiglog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessageconfiglog> selectAll();
}