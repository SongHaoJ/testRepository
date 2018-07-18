package com.bean.dao;

import com.bean.model.DbExpressandlable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressandlableMapper {
    DbExpressandlable selectByCriteria(DbExpressandlable DbExpressandlable);

    void deleteByPrimaryKey(String EXPRESSID);

    void deleteByCriteria(DbExpressandlable DbExpressandlable);

    int insertByCriteria(DbExpressandlable DbExpressandlable);

    int updateByCriteria(DbExpressandlable DbExpressandlable);

    DbExpressandlable selectByPrimaryKey(String expressid);

    List<DbExpressandlable> selectAll();
}