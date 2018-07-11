package com.bean.dao;

import com.bean.model.DbYdfcountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbYdfcountryMapper {
    DbYdfcountry selectByCriteria(DbYdfcountry DbYdfcountry);

    void deleteByPrimaryKey(String COUNTRYID);

    void deleteByCriteria(DbYdfcountry DbYdfcountry);

    int insertByCriteria(DbYdfcountry DbYdfcountry);

    int updateByCriteria(DbYdfcountry DbYdfcountry);

    DbYdfcountry selectByPrimaryKey(String countryid);

    List<DbYdfcountry> selectAll();
}