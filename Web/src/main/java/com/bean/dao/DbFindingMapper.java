package com.bean.dao;

import com.bean.model.DbFinding;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbFindingMapper {
    DbFinding selectByCriteria(DbFinding DbFinding);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbFinding DbFinding);

    int insertByCriteria(DbFinding DbFinding);

    int updateByCriteria(DbFinding DbFinding);

    DbFinding selectByPrimaryKey(BigDecimal id);

    List<DbFinding> selectAll();
}