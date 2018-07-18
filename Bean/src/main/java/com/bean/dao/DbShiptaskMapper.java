package com.bean.dao;

import com.bean.model.DbShiptask;
import org.springframework.stereotype.Service;

import java.util.List;

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