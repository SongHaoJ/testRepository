package com.bean.dao;

import com.bean.model.DbStoragebaskettask;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbStoragebaskettaskMapper {
    DbStoragebaskettask selectByCriteria(DbStoragebaskettask DbStoragebaskettask);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbStoragebaskettask DbStoragebaskettask);

    int insertByCriteria(DbStoragebaskettask DbStoragebaskettask);

    int updateByCriteria(DbStoragebaskettask DbStoragebaskettask);

    DbStoragebaskettask selectByPrimaryKey(BigDecimal id);

    List<DbStoragebaskettask> selectAll();
}