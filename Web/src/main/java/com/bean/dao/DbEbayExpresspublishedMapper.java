package com.bean.dao;

import com.bean.model.DbEbayExpresspublished;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbayExpresspublishedMapper {
    DbEbayExpresspublished selectByCriteria(DbEbayExpresspublished DbEbayExpresspublished);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayExpresspublished DbEbayExpresspublished);

    int insertByCriteria(DbEbayExpresspublished DbEbayExpresspublished);

    int updateByCriteria(DbEbayExpresspublished DbEbayExpresspublished);

    DbEbayExpresspublished selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbayExpresspublished> selectAll();
}