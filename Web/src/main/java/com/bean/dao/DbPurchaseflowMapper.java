package com.bean.dao;

import com.bean.model.DbPurchaseflow;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchaseflowMapper {
    DbPurchaseflow selectByCriteria(DbPurchaseflow DbPurchaseflow);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaseflow DbPurchaseflow);

    int insertByCriteria(DbPurchaseflow DbPurchaseflow);

    int updateByCriteria(DbPurchaseflow DbPurchaseflow);

    DbPurchaseflow selectByPrimaryKey(BigDecimal sequenceid);

    List<DbPurchaseflow> selectAll();
}