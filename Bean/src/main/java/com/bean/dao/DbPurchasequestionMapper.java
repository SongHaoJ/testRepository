package com.bean.dao;

import com.bean.model.DbPurchasequestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPurchasequestionMapper {
    DbPurchasequestion selectByCriteria(DbPurchasequestion DbPurchasequestion);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPurchasequestion DbPurchasequestion);

    int insertByCriteria(DbPurchasequestion DbPurchasequestion);

    int updateByCriteria(DbPurchasequestion DbPurchasequestion);

    DbPurchasequestion selectByPrimaryKey(String sequenceid);

    List<DbPurchasequestion> selectAll();
}