package com.bean.dao;

import com.bean.model.DbShopmessagehistory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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