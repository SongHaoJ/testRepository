package com.bean.dao;

import com.bean.model.DbProductAvg;
import java.util.List;
import org.springframework.stereotype.Service;

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