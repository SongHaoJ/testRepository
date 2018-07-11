package com.bean.dao;

import com.bean.model.DbPurchaseTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchaseTempMapper {
    DbPurchaseTemp selectByCriteria(DbPurchaseTemp DbPurchaseTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaseTemp DbPurchaseTemp);

    int insertByCriteria(DbPurchaseTemp DbPurchaseTemp);

    int updateByCriteria(DbPurchaseTemp DbPurchaseTemp);

    DbPurchaseTemp selectByPrimaryKey(String sequenceid);

    List<DbPurchaseTemp> selectAll();
}