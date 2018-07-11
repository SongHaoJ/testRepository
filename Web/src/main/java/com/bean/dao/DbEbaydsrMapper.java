package com.bean.dao;

import com.bean.model.DbEbaydsr;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbaydsrMapper {
    DbEbaydsr selectByCriteria(DbEbaydsr DbEbaydsr);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaydsr DbEbaydsr);

    int insertByCriteria(DbEbaydsr DbEbaydsr);

    int updateByCriteria(DbEbaydsr DbEbaydsr);

    DbEbaydsr selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbaydsr> selectAll();
}