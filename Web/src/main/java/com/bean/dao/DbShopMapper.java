package com.bean.dao;

import com.bean.model.DbShop;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShopMapper {
    DbShop selectByCriteria(DbShop DbShop);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShop DbShop);

    int insertByCriteria(DbShop DbShop);

    int updateByCriteria(DbShop DbShop);

    DbShop selectByPrimaryKey(String sid);

    List<DbShop> selectAll();
}