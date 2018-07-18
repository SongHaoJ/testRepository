package com.bean.dao;

import com.bean.model.DbBpostcountry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBpostcountryMapper {
    DbBpostcountry selectByCriteria(DbBpostcountry DbBpostcountry);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBpostcountry DbBpostcountry);

    int insertByCriteria(DbBpostcountry DbBpostcountry);

    int updateByCriteria(DbBpostcountry DbBpostcountry);

    DbBpostcountry selectByPrimaryKey(String sid);

    List<DbBpostcountry> selectAll();
}