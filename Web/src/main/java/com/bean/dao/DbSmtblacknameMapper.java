package com.bean.dao;

import com.bean.model.DbSmtblackname;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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