package com.bean.dao;

import com.bean.model.DbPurchase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchaseMapper {
    DbPurchase selectByCriteria(DbPurchase DbPurchase);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchase DbPurchase);

    int insertByCriteria(DbPurchase DbPurchase);

    int updateByCriteria(DbPurchase DbPurchase);

    DbPurchase selectByPrimaryKey(String sequenceid);

    List<DbPurchase> selectAll();
}