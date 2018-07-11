package com.bean.dao;

import com.bean.model.DbShopifyproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShopifyproductMapper {
    DbShopifyproduct selectByCriteria(DbShopifyproduct DbShopifyproduct);

    void deleteByPrimaryKey(String VARIANTID);

    void deleteByCriteria(DbShopifyproduct DbShopifyproduct);

    int insertByCriteria(DbShopifyproduct DbShopifyproduct);

    int updateByCriteria(DbShopifyproduct DbShopifyproduct);

    DbShopifyproduct selectByPrimaryKey(String variantid);

    List<DbShopifyproduct> selectAll();
}