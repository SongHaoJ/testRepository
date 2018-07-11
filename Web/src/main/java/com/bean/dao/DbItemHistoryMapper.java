package com.bean.dao;

import com.bean.model.DbItemHistory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemHistoryMapper {
    DbItemHistory selectByCriteria(DbItemHistory DbItemHistory);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbItemHistory DbItemHistory);

    int insertByCriteria(DbItemHistory DbItemHistory);

    int updateByCriteria(DbItemHistory DbItemHistory);

    DbItemHistory selectByPrimaryKey(BigDecimal sequenceid);

    List<DbItemHistory> selectAll();
}