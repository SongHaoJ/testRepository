package com.bean.dao;

import com.bean.model.DbEbayidmanage;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbEbayidmanageMapper {
    DbEbayidmanage selectByCriteria(DbEbayidmanage DbEbayidmanage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayidmanage DbEbayidmanage);

    int insertByCriteria(DbEbayidmanage DbEbayidmanage);

    int updateByCriteria(DbEbayidmanage DbEbayidmanage);

    DbEbayidmanage selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbayidmanage> selectAll();
}