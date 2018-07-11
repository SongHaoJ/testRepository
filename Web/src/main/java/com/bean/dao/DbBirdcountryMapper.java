package com.bean.dao;

import com.bean.model.DbBirdcountry;
import java.util.List;
import org.springframework.stereotype.Service;

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