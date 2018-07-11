package com.bean.dao;

import com.bean.model.DbScanorder;
import java.util.List;
import org.springframework.stereotype.Service;

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