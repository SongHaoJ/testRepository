package com.bean.dao;

import com.bean.model.DbProductHistory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProductHistoryMapper {
    DbProductHistory selectByCriteria(DbProductHistory DbProductHistory);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductHistory DbProductHistory);

    int insertByCriteria(DbProductHistory DbProductHistory);

    int updateByCriteria(DbProductHistory DbProductHistory);

    DbProductHistory selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductHistory> selectAll();
}