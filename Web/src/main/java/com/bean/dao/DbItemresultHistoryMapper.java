package com.bean.dao;

import com.bean.model.DbItemresultHistory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemresultHistoryMapper {
    DbItemresultHistory selectByCriteria(DbItemresultHistory DbItemresultHistory);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemresultHistory DbItemresultHistory);

    int insertByCriteria(DbItemresultHistory DbItemresultHistory);

    int updateByCriteria(DbItemresultHistory DbItemresultHistory);

    DbItemresultHistory selectByPrimaryKey(BigDecimal sid);

    List<DbItemresultHistory> selectAll();
}