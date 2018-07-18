package com.bean.dao;

import com.bean.model.DbEbayinquiry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbayinquiryMapper {
    DbEbayinquiry selectByCriteria(DbEbayinquiry DbEbayinquiry);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayinquiry DbEbayinquiry);

    int insertByCriteria(DbEbayinquiry DbEbayinquiry);

    int updateByCriteria(DbEbayinquiry DbEbayinquiry);

    DbEbayinquiry selectByPrimaryKey(String sequenceid);

    List<DbEbayinquiry> selectAll();
}