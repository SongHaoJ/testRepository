package com.bean.dao;

import com.bean.model.DbShiptask;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShiptaskMapper {
    DbShiptask selectByCriteria(DbShiptask DbShiptask);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShiptask DbShiptask);

    int insertByCriteria(DbShiptask DbShiptask);

    int updateByCriteria(DbShiptask DbShiptask);

    DbShiptask selectByPrimaryKey(Long id);

    List<DbShiptask> selectAll();
}