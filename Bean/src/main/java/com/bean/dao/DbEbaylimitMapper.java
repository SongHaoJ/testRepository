package com.bean.dao;

import com.bean.model.DbEbaylimit;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbEbaylimitMapper {
    DbEbaylimit selectByCriteria(DbEbaylimit DbEbaylimit);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaylimit DbEbaylimit);

    int insertByCriteria(DbEbaylimit DbEbaylimit);

    int updateByCriteria(DbEbaylimit DbEbaylimit);

    DbEbaylimit selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbaylimit> selectAll();
}