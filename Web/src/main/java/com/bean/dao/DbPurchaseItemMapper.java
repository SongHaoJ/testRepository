package com.bean.dao;

import com.bean.model.DbPurchaseItem;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPurchaseItemMapper {
    DbPurchaseItem selectByCriteria(DbPurchaseItem DbPurchaseItem);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPurchaseItem DbPurchaseItem);

    int insertByCriteria(DbPurchaseItem DbPurchaseItem);

    int updateByCriteria(DbPurchaseItem DbPurchaseItem);

    DbPurchaseItem selectByPrimaryKey(Long id);

    List<DbPurchaseItem> selectAll();
}