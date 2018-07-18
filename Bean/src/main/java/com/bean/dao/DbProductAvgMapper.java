package com.bean.dao;

import com.bean.model.DbProductAvg;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductAvgMapper {
    DbProductAvg selectByCriteria(DbProductAvg DbProductAvg);

    void deleteByPrimaryKey(String SKU);

    void deleteByCriteria(DbProductAvg DbProductAvg);

    int insertByCriteria(DbProductAvg DbProductAvg);

    int updateByCriteria(DbProductAvg DbProductAvg);

    DbProductAvg selectByPrimaryKey(String sku);

    List<DbProductAvg> selectAll();
}