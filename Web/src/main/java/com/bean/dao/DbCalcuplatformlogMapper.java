package com.bean.dao;

import com.bean.model.DbCalcuplatformlog;
import java.util.List;
import org.springframework.stereotype.Service;

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