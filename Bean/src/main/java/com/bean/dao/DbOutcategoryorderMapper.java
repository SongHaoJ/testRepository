package com.bean.dao;

import com.bean.model.DbOutcategoryorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOutcategoryorderMapper {
    DbOutcategoryorder selectByCriteria(DbOutcategoryorder DbOutcategoryorder);

    void deleteByPrimaryKey(String EBAYORDERID);

    void deleteByCriteria(DbOutcategoryorder DbOutcategoryorder);

    int insertByCriteria(DbOutcategoryorder DbOutcategoryorder);

    int updateByCriteria(DbOutcategoryorder DbOutcategoryorder);

    DbOutcategoryorder selectByPrimaryKey(String ebayorderid);

    List<DbOutcategoryorder> selectAll();
}