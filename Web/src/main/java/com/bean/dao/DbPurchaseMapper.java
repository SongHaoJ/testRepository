package com.bean.dao;

import com.bean.model.DbPurchase;
import java.util.List;
import org.springframework.stereotype.Service;

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