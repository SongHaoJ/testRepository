package com.bean.dao;

import com.bean.model.DbQtcountry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbQtcountryMapper {
    DbQtcountry selectByCriteria(DbQtcountry DbQtcountry);

    void deleteByPrimaryKey(String CODE2);

    void deleteByCriteria(DbQtcountry DbQtcountry);

    int insertByCriteria(DbQtcountry DbQtcountry);

    int updateByCriteria(DbQtcountry DbQtcountry);

    DbQtcountry selectByPrimaryKey(String code2);

    List<DbQtcountry> selectAll();
}