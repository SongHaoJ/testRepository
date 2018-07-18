package com.bean.dao;

import com.bean.model.DbEbaymessageorderconfiglog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaymessageorderconfiglogMapper {
    DbEbaymessageorderconfiglog selectByCriteria(DbEbaymessageorderconfiglog DbEbaymessageorderconfiglog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessageorderconfiglog DbEbaymessageorderconfiglog);

    int insertByCriteria(DbEbaymessageorderconfiglog DbEbaymessageorderconfiglog);

    int updateByCriteria(DbEbaymessageorderconfiglog DbEbaymessageorderconfiglog);

    DbEbaymessageorderconfiglog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessageorderconfiglog> selectAll();
}