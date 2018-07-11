package com.bean.dao;

import com.bean.model.DbPricelist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPricelistMapper {
    DbPricelist selectByCriteria(DbPricelist DbPricelist);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPricelist DbPricelist);

    int insertByCriteria(DbPricelist DbPricelist);

    int updateByCriteria(DbPricelist DbPricelist);

    DbPricelist selectByPrimaryKey(String sid);

    List<DbPricelist> selectAll();
}