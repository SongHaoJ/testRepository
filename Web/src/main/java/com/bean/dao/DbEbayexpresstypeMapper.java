package com.bean.dao;

import com.bean.model.DbEbayexpresstype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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