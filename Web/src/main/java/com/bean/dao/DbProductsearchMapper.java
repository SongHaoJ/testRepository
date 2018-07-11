package com.bean.dao;

import com.bean.model.DbProductsearch;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductsearchMapper {
    DbProductsearch selectByCriteria(DbProductsearch DbProductsearch);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductsearch DbProductsearch);

    int insertByCriteria(DbProductsearch DbProductsearch);

    int updateByCriteria(DbProductsearch DbProductsearch);

    DbProductsearch selectByPrimaryKey(String sequenceid);

    List<DbProductsearch> selectAll();
}