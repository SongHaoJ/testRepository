package com.bean.dao;

import com.bean.model.DbEbaymessageconfiglog;
import java.util.List;
import org.springframework.stereotype.Service;

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