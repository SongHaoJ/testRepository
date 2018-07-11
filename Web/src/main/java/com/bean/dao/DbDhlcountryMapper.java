package com.bean.dao;

import com.bean.model.DbDhlcountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDhlcountryMapper {
    DbDhlcountry selectByCriteria(DbDhlcountry DbDhlcountry);

    void deleteByPrimaryKey(String COUNTRYCODE);

    void deleteByCriteria(DbDhlcountry DbDhlcountry);

    int insertByCriteria(DbDhlcountry DbDhlcountry);

    int updateByCriteria(DbDhlcountry DbDhlcountry);

    DbDhlcountry selectByPrimaryKey(String countrycode);

    List<DbDhlcountry> selectAll();
}