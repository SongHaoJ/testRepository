package com.bean.dao;

import com.bean.model.DbShopmessagehistory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShopmessagehistoryMapper {
    DbShopmessagehistory selectByCriteria(DbShopmessagehistory DbShopmessagehistory);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbShopmessagehistory DbShopmessagehistory);

    int insertByCriteria(DbShopmessagehistory DbShopmessagehistory);

    int updateByCriteria(DbShopmessagehistory DbShopmessagehistory);

    DbShopmessagehistory selectByPrimaryKey(BigDecimal sequenceid);

    List<DbShopmessagehistory> selectAll();
}