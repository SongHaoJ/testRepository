package com.bean.dao;

import com.bean.model.DbPurchaseflowLog;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbPurchaseflowLogMapper {
    DbPurchaseflowLog selectByCriteria(DbPurchaseflowLog DbPurchaseflowLog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaseflowLog DbPurchaseflowLog);

    int insertByCriteria(DbPurchaseflowLog DbPurchaseflowLog);

    int updateByCriteria(DbPurchaseflowLog DbPurchaseflowLog);

    DbPurchaseflowLog selectByPrimaryKey(BigDecimal sequenceid);

    List<DbPurchaseflowLog> selectAll();
}