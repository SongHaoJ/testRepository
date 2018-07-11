package com.bean.dao;

import com.bean.model.DbPurchasedevelop;
import java.util.List;
import org.springframework.stereotype.Service;

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