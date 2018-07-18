package com.bean.dao;

import com.bean.model.DbPicurl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbPicurlMapper {
    DbPicurl selectByCriteria(DbPicurl DbPicurl);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPicurl DbPicurl);

    int insertByCriteria(DbPicurl DbPicurl);

    int updateByCriteria(DbPicurl DbPicurl);

    DbPicurl selectByPrimaryKey(BigDecimal sid);

    List<DbPicurl> selectAll();
}