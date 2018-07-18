package com.bean.dao;

import com.bean.model.DbPurchasepaymentlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasepaymentlogMapper {
    DbPurchasepaymentlog selectByCriteria(DbPurchasepaymentlog DbPurchasepaymentlog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPurchasepaymentlog DbPurchasepaymentlog);

    int insertByCriteria(DbPurchasepaymentlog DbPurchasepaymentlog);

    int updateByCriteria(DbPurchasepaymentlog DbPurchasepaymentlog);

    DbPurchasepaymentlog selectByPrimaryKey(String sid);

    List<DbPurchasepaymentlog> selectAll();
}