package com.bean.dao;

import com.bean.model.DbEbaybbe;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbaybbeMapper {
    DbEbaybbe selectByCriteria(DbEbaybbe DbEbaybbe);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaybbe DbEbaybbe);

    int insertByCriteria(DbEbaybbe DbEbaybbe);

    int updateByCriteria(DbEbaybbe DbEbaybbe);

    DbEbaybbe selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbaybbe> selectAll();
}