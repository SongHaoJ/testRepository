package com.bean.dao;

import com.bean.model.DbPlatformlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPlatformlogMapper {
    DbPlatformlog selectByCriteria(DbPlatformlog DbPlatformlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPlatformlog DbPlatformlog);

    int insertByCriteria(DbPlatformlog DbPlatformlog);

    int updateByCriteria(DbPlatformlog DbPlatformlog);

    DbPlatformlog selectByPrimaryKey(String sequenceid);

    List<DbPlatformlog> selectAll();
}