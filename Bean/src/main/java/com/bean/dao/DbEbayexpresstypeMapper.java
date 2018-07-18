package com.bean.dao;

import com.bean.model.DbEbayexpresstype;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbEbayexpresstypeMapper {
    DbEbayexpresstype selectByCriteria(DbEbayexpresstype DbEbayexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEbayexpresstype DbEbayexpresstype);

    int insertByCriteria(DbEbayexpresstype DbEbayexpresstype);

    int updateByCriteria(DbEbayexpresstype DbEbayexpresstype);

    DbEbayexpresstype selectByPrimaryKey(BigDecimal sid);

    List<DbEbayexpresstype> selectAll();
}