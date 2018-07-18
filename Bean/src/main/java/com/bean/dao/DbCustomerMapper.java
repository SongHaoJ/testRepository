package com.bean.dao;

import com.bean.model.DbCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCustomerMapper {
    DbCustomer selectByCriteria(DbCustomer DbCustomer);

    void deleteByPrimaryKey(String CUSTOMERID);

    void deleteByCriteria(DbCustomer DbCustomer);

    int insertByCriteria(DbCustomer DbCustomer);

    int updateByCriteria(DbCustomer DbCustomer);

    DbCustomer selectByPrimaryKey(String customerid);

    List<DbCustomer> selectAll();
}