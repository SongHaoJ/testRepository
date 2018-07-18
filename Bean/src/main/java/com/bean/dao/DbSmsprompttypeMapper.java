package com.bean.dao;

import com.bean.model.DbSmsprompttype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSmsprompttypeMapper {
    DbSmsprompttype selectByCriteria(DbSmsprompttype DbSmsprompttype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmsprompttype DbSmsprompttype);

    int insertByCriteria(DbSmsprompttype DbSmsprompttype);

    int updateByCriteria(DbSmsprompttype DbSmsprompttype);

    DbSmsprompttype selectByPrimaryKey(String sequenceid);

    List<DbSmsprompttype> selectAll();
}