package com.bean.dao;

import com.bean.model.DbEbayapi;
import java.util.List;
import org.springframework.stereotype.Service;

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