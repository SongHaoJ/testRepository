package com.bean.dao;

import com.bean.model.DbYwcountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbYwcountryMapper {
    DbYwcountry selectByCriteria(DbYwcountry DbYwcountry);

    void deleteByPrimaryKey(String NAME);

    void deleteByCriteria(DbYwcountry DbYwcountry);

    int insertByCriteria(DbYwcountry DbYwcountry);

    int updateByCriteria(DbYwcountry DbYwcountry);

    DbYwcountry selectByPrimaryKey(String name);

    List<DbYwcountry> selectAll();
}