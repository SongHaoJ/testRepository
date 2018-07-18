package com.bean.dao;

import com.bean.model.DbPurchasehand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasehandMapper {
    DbPurchasehand selectByCriteria(DbPurchasehand DbPurchasehand);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchasehand DbPurchasehand);

    int insertByCriteria(DbPurchasehand DbPurchasehand);

    int updateByCriteria(DbPurchasehand DbPurchasehand);

    DbPurchasehand selectByPrimaryKey(String sequenceid);

    List<DbPurchasehand> selectAll();
}