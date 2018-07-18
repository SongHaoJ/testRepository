package com.bean.dao;

import com.bean.model.DbReturnreason;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbReturnreasonMapper {
    DbReturnreason selectByCriteria(DbReturnreason DbReturnreason);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbReturnreason DbReturnreason);

    int insertByCriteria(DbReturnreason DbReturnreason);

    int updateByCriteria(DbReturnreason DbReturnreason);

    DbReturnreason selectByPrimaryKey(BigDecimal sid);

    List<DbReturnreason> selectAll();
}