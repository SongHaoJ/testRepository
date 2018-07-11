package com.bean.dao;

import com.bean.model.DbPurchaseflowLog;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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