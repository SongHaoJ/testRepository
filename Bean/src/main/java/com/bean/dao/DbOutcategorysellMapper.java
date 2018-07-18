package com.bean.dao;

import com.bean.model.DbOutcategorysell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOutcategorysellMapper {
    DbOutcategorysell selectByCriteria(DbOutcategorysell DbOutcategorysell);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOutcategorysell DbOutcategorysell);

    int insertByCriteria(DbOutcategorysell DbOutcategorysell);

    int updateByCriteria(DbOutcategorysell DbOutcategorysell);

    DbOutcategorysell selectByPrimaryKey(String sid);

    List<DbOutcategorysell> selectAll();
}