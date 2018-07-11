package com.bean.dao;

import com.bean.model.DbOrdersearch;
import java.util.List;
import org.springframework.stereotype.Service;

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