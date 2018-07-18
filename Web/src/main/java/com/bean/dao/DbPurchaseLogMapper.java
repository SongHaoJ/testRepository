package com.bean.dao;

import com.bean.model.DbPurchaselog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchaselogMapper {
    DbPurchaselog selectByCriteria(DbPurchaselog DbPurchaselog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchaselog DbPurchaselog);

    int insertByCriteria(DbPurchaselog DbPurchaselog);

    int updateByCriteria(DbPurchaselog DbPurchaselog);

    DbPurchaselog selectByPrimaryKey(String sequenceid);

    List<DbPurchaselog> selectAll();
}