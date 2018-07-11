package com.bean.dao;

import com.bean.model.DbShopingtask;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShopingtaskMapper {
    DbShopingtask selectByCriteria(DbShopingtask DbShopingtask);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbShopingtask DbShopingtask);

    int insertByCriteria(DbShopingtask DbShopingtask);

    int updateByCriteria(DbShopingtask DbShopingtask);

    DbShopingtask selectByPrimaryKey(BigDecimal itemid);

    List<DbShopingtask> selectAll();
}