package com.bean.dao;

import com.bean.model.DbBirdcountry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBirdcountryMapper {
    DbBirdcountry selectByCriteria(DbBirdcountry DbBirdcountry);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBirdcountry DbBirdcountry);

    int insertByCriteria(DbBirdcountry DbBirdcountry);

    int updateByCriteria(DbBirdcountry DbBirdcountry);

    DbBirdcountry selectByPrimaryKey(String sid);

    List<DbBirdcountry> selectAll();
}