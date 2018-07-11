package com.bean.dao;

import com.bean.model.DbEbaysite;
import java.util.List;
import org.springframework.stereotype.Service;

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