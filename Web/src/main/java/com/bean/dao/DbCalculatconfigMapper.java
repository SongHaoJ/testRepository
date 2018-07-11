package com.bean.dao;

import com.bean.model.DbCalculatconfig;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalculatconfigMapper {
    DbCalculatconfig selectByCriteria(DbCalculatconfig DbCalculatconfig);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbCalculatconfig DbCalculatconfig);

    int insertByCriteria(DbCalculatconfig DbCalculatconfig);

    int updateByCriteria(DbCalculatconfig DbCalculatconfig);

    DbCalculatconfig selectByPrimaryKey(BigDecimal id);

    List<DbCalculatconfig> selectAll();
}