package com.bean.dao;

import com.bean.model.DbEbayapi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbayapiMapper {
    DbEbayapi selectByCriteria(DbEbayapi DbEbayapi);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayapi DbEbayapi);

    int insertByCriteria(DbEbayapi DbEbayapi);

    int updateByCriteria(DbEbayapi DbEbayapi);

    DbEbayapi selectByPrimaryKey(String sequenceid);

    List<DbEbayapi> selectAll();
}