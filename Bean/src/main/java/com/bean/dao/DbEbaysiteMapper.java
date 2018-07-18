package com.bean.dao;

import com.bean.model.DbEbaysite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaysiteMapper {
    DbEbaysite selectByCriteria(DbEbaysite DbEbaysite);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEbaysite DbEbaysite);

    int insertByCriteria(DbEbaysite DbEbaysite);

    int updateByCriteria(DbEbaysite DbEbaysite);

    DbEbaysite selectByPrimaryKey(String sid);

    List<DbEbaysite> selectAll();
}