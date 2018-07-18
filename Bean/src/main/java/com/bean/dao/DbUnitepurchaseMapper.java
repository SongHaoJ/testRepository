package com.bean.dao;

import com.bean.model.DbUnitepurchase;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbUnitepurchaseMapper {
    DbUnitepurchase selectByCriteria(DbUnitepurchase DbUnitepurchase);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbUnitepurchase DbUnitepurchase);

    int insertByCriteria(DbUnitepurchase DbUnitepurchase);

    int updateByCriteria(DbUnitepurchase DbUnitepurchase);

    DbUnitepurchase selectByPrimaryKey(BigDecimal sequenceid);

    List<DbUnitepurchase> selectAll();
}