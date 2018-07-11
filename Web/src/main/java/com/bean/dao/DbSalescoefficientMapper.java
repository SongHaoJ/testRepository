package com.bean.dao;

import com.bean.model.DbSalescoefficient;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSalescoefficientMapper {
    DbSalescoefficient selectByCriteria(DbSalescoefficient DbSalescoefficient);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSalescoefficient DbSalescoefficient);

    int insertByCriteria(DbSalescoefficient DbSalescoefficient);

    int updateByCriteria(DbSalescoefficient DbSalescoefficient);

    DbSalescoefficient selectByPrimaryKey(String sequenceid);

    List<DbSalescoefficient> selectAll();
}