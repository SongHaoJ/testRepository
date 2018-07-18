package com.bean.dao;

import com.bean.model.DbShopdowntimeconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShopdowntimeconfigMapper {
    DbShopdowntimeconfig selectByCriteria(DbShopdowntimeconfig DbShopdowntimeconfig);

    void deleteByPrimaryKey(String SHOPID);

    void deleteByCriteria(DbShopdowntimeconfig DbShopdowntimeconfig);

    int insertByCriteria(DbShopdowntimeconfig DbShopdowntimeconfig);

    int updateByCriteria(DbShopdowntimeconfig DbShopdowntimeconfig);

    DbShopdowntimeconfig selectByPrimaryKey(String shopid);

    List<DbShopdowntimeconfig> selectAll();
}