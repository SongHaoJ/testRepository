package com.bean.dao;

import com.bean.model.DbShopifyorder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShopifyorderMapper {
    DbShopifyorder selectByCriteria(DbShopifyorder DbShopifyorder);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShopifyorder DbShopifyorder);

    int insertByCriteria(DbShopifyorder DbShopifyorder);

    int updateByCriteria(DbShopifyorder DbShopifyorder);

    DbShopifyorder selectByPrimaryKey(String id);

    List<DbShopifyorder> selectAll();
}