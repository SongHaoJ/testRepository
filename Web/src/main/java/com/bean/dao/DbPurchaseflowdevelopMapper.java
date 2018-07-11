package com.bean.dao;

import com.bean.model.DbPurchaseflowdevelop;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchaseflowdevelopMapper {
    DbPurchaseflowdevelop selectByCriteria(DbPurchaseflowdevelop DbPurchaseflowdevelop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaseflowdevelop DbPurchaseflowdevelop);

    int insertByCriteria(DbPurchaseflowdevelop DbPurchaseflowdevelop);

    int updateByCriteria(DbPurchaseflowdevelop DbPurchaseflowdevelop);

    DbPurchaseflowdevelop selectByPrimaryKey(BigDecimal sequenceid);

    List<DbPurchaseflowdevelop> selectAll();
}