package com.bean.dao;

import com.bean.model.DbBpostcountry;
import java.util.List;
import org.springframework.stereotype.Service;

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