package com.bean.dao;

import com.bean.model.DbCalcuplatformlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalcuplatformlogMapper {
    DbCalcuplatformlog selectByCriteria(DbCalcuplatformlog DbCalcuplatformlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcuplatformlog DbCalcuplatformlog);

    int insertByCriteria(DbCalcuplatformlog DbCalcuplatformlog);

    int updateByCriteria(DbCalcuplatformlog DbCalcuplatformlog);

    DbCalcuplatformlog selectByPrimaryKey(String sequenceid);

    List<DbCalcuplatformlog> selectAll();
}