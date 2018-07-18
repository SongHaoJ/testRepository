package com.bean.dao;

import com.bean.model.DbUsershowconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbUsershowconfigMapper {
    DbUsershowconfig selectByCriteria(DbUsershowconfig DbUsershowconfig);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbUsershowconfig DbUsershowconfig);

    int insertByCriteria(DbUsershowconfig DbUsershowconfig);

    int updateByCriteria(DbUsershowconfig DbUsershowconfig);

    DbUsershowconfig selectByPrimaryKey(Integer id);

    List<DbUsershowconfig> selectAll();
}