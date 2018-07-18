package com.bean.dao;

import com.bean.model.DbScanorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbScanorderMapper {
    DbScanorder selectByCriteria(DbScanorder DbScanorder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbScanorder DbScanorder);

    int insertByCriteria(DbScanorder DbScanorder);

    int updateByCriteria(DbScanorder DbScanorder);

    DbScanorder selectByPrimaryKey(String orderid);

    List<DbScanorder> selectAll();
}