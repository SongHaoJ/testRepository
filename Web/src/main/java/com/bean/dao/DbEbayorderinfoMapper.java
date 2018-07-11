package com.bean.dao;

import com.bean.model.DbEbayorderinfo;
import java.util.List;
import org.springframework.stereotype.Service;

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