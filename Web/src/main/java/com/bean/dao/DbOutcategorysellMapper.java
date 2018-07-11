package com.bean.dao;

import com.bean.model.DbOutcategorysell;
import java.util.List;
import org.springframework.stereotype.Service;

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