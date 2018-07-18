package com.bean.dao;

import com.bean.model.DbPurchasetoallot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasetoallotMapper {
    DbPurchasetoallot selectByCriteria(DbPurchasetoallot DbPurchasetoallot);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchasetoallot DbPurchasetoallot);

    int insertByCriteria(DbPurchasetoallot DbPurchasetoallot);

    int updateByCriteria(DbPurchasetoallot DbPurchasetoallot);

    DbPurchasetoallot selectByPrimaryKey(String sequenceid);

    List<DbPurchasetoallot> selectAll();
}