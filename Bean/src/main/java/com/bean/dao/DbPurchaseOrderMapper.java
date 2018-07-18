package com.bean.dao;

import com.bean.model.DbPurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchaseOrderMapper {
    DbPurchaseOrder selectByCriteria(DbPurchaseOrder DbPurchaseOrder);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPurchaseOrder DbPurchaseOrder);

    int insertByCriteria(DbPurchaseOrder DbPurchaseOrder);

    int updateByCriteria(DbPurchaseOrder DbPurchaseOrder);

    DbPurchaseOrder selectByPrimaryKey(Long id);

    List<DbPurchaseOrder> selectAll();
}