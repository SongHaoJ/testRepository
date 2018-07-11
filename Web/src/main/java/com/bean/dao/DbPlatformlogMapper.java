package com.bean.dao;

import com.bean.model.DbPlatformlog;
import java.util.List;
import org.springframework.stereotype.Service;

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