package com.bean.dao;

import com.bean.model.DbOrderHistoryLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderHistoryLogMapper {
    DbOrderHistoryLog selectByCriteria(DbOrderHistoryLog DbOrderHistoryLog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrderHistoryLog DbOrderHistoryLog);

    int insertByCriteria(DbOrderHistoryLog DbOrderHistoryLog);

    int updateByCriteria(DbOrderHistoryLog DbOrderHistoryLog);

    DbOrderHistoryLog selectByPrimaryKey(String sequenceid);

    List<DbOrderHistoryLog> selectAll();
}