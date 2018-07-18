package com.bean.dao;

import com.bean.model.DbEbayforexpress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbayforexpressMapper {
    DbEbayforexpress selectByCriteria(DbEbayforexpress DbEbayforexpress);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayforexpress DbEbayforexpress);

    int insertByCriteria(DbEbayforexpress DbEbayforexpress);

    int updateByCriteria(DbEbayforexpress DbEbayforexpress);

    DbEbayforexpress selectByPrimaryKey(String sequenceid);

    List<DbEbayforexpress> selectAll();
}