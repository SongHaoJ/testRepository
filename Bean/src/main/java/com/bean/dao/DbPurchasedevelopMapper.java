package com.bean.dao;

import com.bean.model.DbPurchasedevelop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasedevelopMapper {
    DbPurchasedevelop selectByCriteria(DbPurchasedevelop DbPurchasedevelop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchasedevelop DbPurchasedevelop);

    int insertByCriteria(DbPurchasedevelop DbPurchasedevelop);

    int updateByCriteria(DbPurchasedevelop DbPurchasedevelop);

    DbPurchasedevelop selectByPrimaryKey(String sequenceid);

    List<DbPurchasedevelop> selectAll();
}