package com.bean.dao;

import com.bean.model.DbFindingtask;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFindingtaskMapper {
    DbFindingtask selectByCriteria(DbFindingtask DbFindingtask);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFindingtask DbFindingtask);

    int insertByCriteria(DbFindingtask DbFindingtask);

    int updateByCriteria(DbFindingtask DbFindingtask);

    DbFindingtask selectByPrimaryKey(String sid);

    List<DbFindingtask> selectAll();
}