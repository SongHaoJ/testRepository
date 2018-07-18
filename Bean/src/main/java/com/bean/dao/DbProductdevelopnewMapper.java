package com.bean.dao;

import com.bean.model.DbProductdevelopnew;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductdevelopnewMapper {
    DbProductdevelopnew selectByCriteria(DbProductdevelopnew DbProductdevelopnew);

    void deleteByPrimaryKey(String SKU);

    void deleteByCriteria(DbProductdevelopnew DbProductdevelopnew);

    int insertByCriteria(DbProductdevelopnew DbProductdevelopnew);

    int updateByCriteria(DbProductdevelopnew DbProductdevelopnew);

    DbProductdevelopnew selectByPrimaryKey(String sku);

    List<DbProductdevelopnew> selectAll();
}