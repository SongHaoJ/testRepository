package com.bean.dao;

import com.bean.model.DbOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderMapper {
    DbOrder selectByCriteria(DbOrder DbOrder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbOrder DbOrder);

    int insertByCriteria(DbOrder DbOrder);

    int updateByCriteria(DbOrder DbOrder);

    DbOrder selectByPrimaryKey(String orderid);

    List<DbOrder> selectAll();
}