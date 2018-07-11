package com.bean.dao;

import com.bean.model.DbMatecategory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMatecategoryMapper {
    DbMatecategory selectByCriteria(DbMatecategory DbMatecategory);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbMatecategory DbMatecategory);

    int insertByCriteria(DbMatecategory DbMatecategory);

    int updateByCriteria(DbMatecategory DbMatecategory);

    DbMatecategory selectByPrimaryKey(BigDecimal sid);

    List<DbMatecategory> selectAll();
}