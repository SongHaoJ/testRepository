package com.bean.dao;

import com.bean.model.DbProductdevelopnew;
import java.util.List;
import org.springframework.stereotype.Service;

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