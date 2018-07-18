package com.bean.dao;

import com.bean.model.DbSmtblackname;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbSmtblacknameMapper {
    DbSmtblackname selectByCriteria(DbSmtblackname DbSmtblackname);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSmtblackname DbSmtblackname);

    int insertByCriteria(DbSmtblackname DbSmtblackname);

    int updateByCriteria(DbSmtblackname DbSmtblackname);

    DbSmtblackname selectByPrimaryKey(BigDecimal sid);

    List<DbSmtblackname> selectAll();
}