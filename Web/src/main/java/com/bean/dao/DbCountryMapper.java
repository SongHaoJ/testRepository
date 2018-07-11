package com.bean.dao;

import com.bean.model.DbCountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCountryMapper {
    DbCountry selectByCriteria(DbCountry DbCountry);

    void deleteByPrimaryKey(String COUNTRYID);

    void deleteByCriteria(DbCountry DbCountry);

    int insertByCriteria(DbCountry DbCountry);

    int updateByCriteria(DbCountry DbCountry);

    DbCountry selectByPrimaryKey(String countryid);

    List<DbCountry> selectAll();
}