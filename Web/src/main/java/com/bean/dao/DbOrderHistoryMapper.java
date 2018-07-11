package com.bean.dao;

import com.bean.model.DbOrderHistory;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrderHistoryMapper {
    DbOrderHistory selectByCriteria(DbOrderHistory DbOrderHistory);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbOrderHistory DbOrderHistory);

    int insertByCriteria(DbOrderHistory DbOrderHistory);

    int updateByCriteria(DbOrderHistory DbOrderHistory);

    DbOrderHistory selectByPrimaryKey(String orderid);

    List<DbOrderHistory> selectAll();
}