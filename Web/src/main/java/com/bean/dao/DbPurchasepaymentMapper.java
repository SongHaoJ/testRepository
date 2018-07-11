package com.bean.dao;

import com.bean.model.DbPurchasepayment;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchasepaymentMapper {
    DbPurchasepayment selectByCriteria(DbPurchasepayment DbPurchasepayment);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPurchasepayment DbPurchasepayment);

    int insertByCriteria(DbPurchasepayment DbPurchasepayment);

    int updateByCriteria(DbPurchasepayment DbPurchasepayment);

    DbPurchasepayment selectByPrimaryKey(String sid);

    List<DbPurchasepayment> selectAll();
}