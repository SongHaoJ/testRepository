package com.bean.dao;

import com.bean.model.DbEbayorderinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbayorderinfoMapper {
    DbEbayorderinfo selectByCriteria(DbEbayorderinfo DbEbayorderinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayorderinfo DbEbayorderinfo);

    int insertByCriteria(DbEbayorderinfo DbEbayorderinfo);

    int updateByCriteria(DbEbayorderinfo DbEbayorderinfo);

    DbEbayorderinfo selectByPrimaryKey(String sequenceid);

    List<DbEbayorderinfo> selectAll();
}