package com.bean.dao;

import com.bean.model.DbFpxcountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbFpxcountryMapper {
    DbFpxcountry selectByCriteria(DbFpxcountry DbFpxcountry);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFpxcountry DbFpxcountry);

    int insertByCriteria(DbFpxcountry DbFpxcountry);

    int updateByCriteria(DbFpxcountry DbFpxcountry);

    DbFpxcountry selectByPrimaryKey(String sid);

    List<DbFpxcountry> selectAll();
}