package com.bean.dao;

import com.bean.model.DbReturnreason;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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