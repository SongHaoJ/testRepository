package com.bean.dao;

import com.bean.model.DbOrdersearch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrdersearchMapper {
    DbOrdersearch selectByCriteria(DbOrdersearch DbOrdersearch);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrdersearch DbOrdersearch);

    int insertByCriteria(DbOrdersearch DbOrdersearch);

    int updateByCriteria(DbOrdersearch DbOrdersearch);

    DbOrdersearch selectByPrimaryKey(String sequenceid);

    List<DbOrdersearch> selectAll();
}