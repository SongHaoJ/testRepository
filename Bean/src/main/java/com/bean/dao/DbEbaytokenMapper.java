package com.bean.dao;

import com.bean.model.DbEbaytoken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEbaytokenMapper {
    DbEbaytoken selectByCriteria(DbEbaytoken DbEbaytoken);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaytoken DbEbaytoken);

    int insertByCriteria(DbEbaytoken DbEbaytoken);

    int updateByCriteria(DbEbaytoken DbEbaytoken);

    DbEbaytoken selectByPrimaryKey(String sequenceid);

    List<DbEbaytoken> selectAll();
}