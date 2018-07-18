package com.bean.dao;

import com.bean.model.DbExpresstypeapi;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpresstypeapiMapper {
    DbExpresstypeapi selectByCriteria(DbExpresstypeapi DbExpresstypeapi);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExpresstypeapi DbExpresstypeapi);

    int insertByCriteria(DbExpresstypeapi DbExpresstypeapi);

    int updateByCriteria(DbExpresstypeapi DbExpresstypeapi);

    DbExpresstypeapi selectByPrimaryKey(BigDecimal id);

    List<DbExpresstypeapi> selectAll();
}