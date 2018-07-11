package com.bean.dao;

import com.bean.model.DbDevelopstatus;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDevelopstatusMapper {
    DbDevelopstatus selectByCriteria(DbDevelopstatus DbDevelopstatus);

    void deleteByPrimaryKey(String STATUSID);

    void deleteByCriteria(DbDevelopstatus DbDevelopstatus);

    int insertByCriteria(DbDevelopstatus DbDevelopstatus);

    int updateByCriteria(DbDevelopstatus DbDevelopstatus);

    DbDevelopstatus selectByPrimaryKey(BigDecimal statusid);

    List<DbDevelopstatus> selectAll();
}