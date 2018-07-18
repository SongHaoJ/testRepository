package com.bean.dao;

import com.bean.model.DbPurchaseStock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchaseStockMapper {
    DbPurchaseStock selectByCriteria(DbPurchaseStock DbPurchaseStock);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPurchaseStock DbPurchaseStock);

    int insertByCriteria(DbPurchaseStock DbPurchaseStock);

    int updateByCriteria(DbPurchaseStock DbPurchaseStock);

    DbPurchaseStock selectByPrimaryKey(Long id);

    List<DbPurchaseStock> selectAll();
}