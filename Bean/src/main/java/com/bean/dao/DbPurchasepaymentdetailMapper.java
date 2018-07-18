package com.bean.dao;

import com.bean.model.DbPurchasepaymentdetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasepaymentdetailMapper {
    DbPurchasepaymentdetail selectByCriteria(DbPurchasepaymentdetail DbPurchasepaymentdetail);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPurchasepaymentdetail DbPurchasepaymentdetail);

    int insertByCriteria(DbPurchasepaymentdetail DbPurchasepaymentdetail);

    int updateByCriteria(DbPurchasepaymentdetail DbPurchasepaymentdetail);

    DbPurchasepaymentdetail selectByPrimaryKey(String sid);

    List<DbPurchasepaymentdetail> selectAll();
}