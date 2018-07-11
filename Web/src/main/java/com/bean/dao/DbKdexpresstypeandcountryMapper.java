package com.bean.dao;

import com.bean.model.DbKdexpresstypeandcountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbKdexpresstypeandcountryMapper {
    DbKdexpresstypeandcountry selectByCriteria(DbKdexpresstypeandcountry DbKdexpresstypeandcountry);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbKdexpresstypeandcountry DbKdexpresstypeandcountry);

    int insertByCriteria(DbKdexpresstypeandcountry DbKdexpresstypeandcountry);

    int updateByCriteria(DbKdexpresstypeandcountry DbKdexpresstypeandcountry);

    DbKdexpresstypeandcountry selectByPrimaryKey(String sid);

    List<DbKdexpresstypeandcountry> selectAll();
}