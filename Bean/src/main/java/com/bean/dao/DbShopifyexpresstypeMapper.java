package com.bean.dao;

import com.bean.model.DbShopifyexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShopifyexpresstypeMapper {
    DbShopifyexpresstype selectByCriteria(DbShopifyexpresstype DbShopifyexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShopifyexpresstype DbShopifyexpresstype);

    int insertByCriteria(DbShopifyexpresstype DbShopifyexpresstype);

    int updateByCriteria(DbShopifyexpresstype DbShopifyexpresstype);

    DbShopifyexpresstype selectByPrimaryKey(String sid);

    List<DbShopifyexpresstype> selectAll();
}