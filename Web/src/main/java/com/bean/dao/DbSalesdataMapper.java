package com.bean.dao;

import com.bean.model.DbSalesdata;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSalesdataMapper {
    DbSalesdata selectByCriteria(DbSalesdata DbSalesdata);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSalesdata DbSalesdata);

    int insertByCriteria(DbSalesdata DbSalesdata);

    int updateByCriteria(DbSalesdata DbSalesdata);

    DbSalesdata selectByPrimaryKey(BigDecimal sid);

    List<DbSalesdata> selectAll();
}