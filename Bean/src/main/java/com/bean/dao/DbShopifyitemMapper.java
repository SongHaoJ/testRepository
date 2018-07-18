package com.bean.dao;

import com.bean.model.DbShopifyitem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShopifyitemMapper {
    DbShopifyitem selectByCriteria(DbShopifyitem DbShopifyitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShopifyitem DbShopifyitem);

    int insertByCriteria(DbShopifyitem DbShopifyitem);

    int updateByCriteria(DbShopifyitem DbShopifyitem);

    DbShopifyitem selectByPrimaryKey(Long sid);

    List<DbShopifyitem> selectAll();
}