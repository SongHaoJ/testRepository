package com.bean.dao;

import com.bean.model.DbPurchaseflowdevelopLog;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbPurchaseflowdevelopLogMapper {
    DbPurchaseflowdevelopLog selectByCriteria(DbPurchaseflowdevelopLog DbPurchaseflowdevelopLog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaseflowdevelopLog DbPurchaseflowdevelopLog);

    int insertByCriteria(DbPurchaseflowdevelopLog DbPurchaseflowdevelopLog);

    int updateByCriteria(DbPurchaseflowdevelopLog DbPurchaseflowdevelopLog);

    DbPurchaseflowdevelopLog selectByPrimaryKey(BigDecimal sequenceid);

    List<DbPurchaseflowdevelopLog> selectAll();
}