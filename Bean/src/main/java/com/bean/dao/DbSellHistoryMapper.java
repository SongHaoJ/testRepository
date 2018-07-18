package com.bean.dao;

import com.bean.model.DbSellHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSellHistoryMapper {
    DbSellHistory selectByCriteria(DbSellHistory DbSellHistory);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSellHistory DbSellHistory);

    int insertByCriteria(DbSellHistory DbSellHistory);

    int updateByCriteria(DbSellHistory DbSellHistory);

    DbSellHistory selectByPrimaryKey(String sid);

    List<DbSellHistory> selectAll();
}