package com.bean.dao;

import com.bean.model.DbEnmity;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEnmityMapper {
    DbEnmity selectByCriteria(DbEnmity DbEnmity);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEnmity DbEnmity);

    int insertByCriteria(DbEnmity DbEnmity);

    int updateByCriteria(DbEnmity DbEnmity);

    DbEnmity selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEnmity> selectAll();
}